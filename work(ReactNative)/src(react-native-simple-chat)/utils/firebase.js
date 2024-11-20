import { initializeApp } from 'firebase/app';
import { getAuth, signInWithEmailAndPassword, createUserWithEmailAndPassword, updateProfile, signOut } from 'firebase/auth';
import { uploadBytes,getStorage, ref, getDownloadURL } from "firebase/storage";
import { collection, getFirestore, doc, setDoc} from "firebase/firestore"
import config from '../../firebase.json';

//initializeApp()메서드
//firebase는 전달된 설정을 기반으로 객체를 생성한다.
//이후 app을 통해서 firebase의 인증, 데이터베이스, 스토리지등의 서비스를 이용할 것이다.
const app = initializeApp(config);

const auth = getAuth(app);

const uploadImage = async uri => {
    //만약 URI가 이미 HTTPS로 시작하는 웹 URL이면, 업로드하지 않고 그대로 반환
    if (uri.startsWith('https')) {
        return URL;
    }

    //로컬파일 URI인 경우, fetch를 통해 이미지 데이터를 불러오고 blob형태로 변환
    const response = await fetch(uri);
    const blob = await response.blob();

    const { uid } = auth.currentUser;
    const storage = getStorage(app);

    //Firebase의 Storage인스턴스를 가져오고, 저장할 파일의 참조를 생성
    const storageRef = ref(storage, `/profile/${uid}/photo.png`);

    //지정한 참조에 blob데이터를 image/png형식으로 업로드
    await uploadBytes(storageRef, blob, {
        contentType: 'image/png'
    })

    //업로드된 파일의 다운로드URL을 가져와 반환
    return await getDownloadURL(storageRef)
}

//signInWithEmailAndPassword
//이메일과 비밀번호를 이용해 인증받는 함수
export const login = async ({ email, password }) => {
    const { user } = await signInWithEmailAndPassword(auth, email, password);

    return user;
}

//회원가입 함수
export const signup = async ({ name, email, password, photoUrl }) => {
    //이메일과 비밀번호로 사용자 추가
    const { user } = await createUserWithEmailAndPassword(auth, email, password);
    //주어진 photoUrl에서 uri를 반환하여 저장
    const PhotoUrl = await uploadImage(photoUrl);

    //Firebase의 스토리지에 업로드
    await updateProfile(auth.currentUser, { displayName: name, photoURL : PhotoUrl });

    return user;
}

//로그아웃
export const logout =async() =>{
    await signOut(auth);
    return{};
}

//현재 로그인한 유저의 정보를 불러오는 함수
export const getCurrentUser = () =>{
    const {uid,displayName,email,photoURL} = auth.currentUser
    return {uid,displayName,email,photoURL}
}

//다른 사진을 업로드할 수 있게 수정해주는 함수
//auth.currentUser -> 현재 로그인한 user의 정보
export const updateUserInfo = async photo =>{
    const photoUrl = await uploadImage(photo)
    await updateProfile(auth.currentUser, {photoUrl})
    return photoUrl;
}

export const db = getFirestore(app);

//새로운 채널을 생성하는 함수
//매개변수로 제목과 설명을 얻어온다.
export const createChannel = async({title,description}) =>{
    //Firestore에서 'channels'컬렉션을 참조
    //collection(db,'channels')
    //데이터베이스 객체 db와 컬렉션 이름으로 사용할 channels를 입력받아 특정 컬렉션을 가리킨다.
    //db : firestore의 객체
    //channels이라는 컬렉션에 접근
    const channelCollection = collection(db,'channels')

    //새 문서 참조 생성(랜덤ID가 자동으로 할당됨)
    //doc(channelCollection)
    //channels 컬렉션에서 새로운 문서를 위한 참조를 생성
    //이렇게 생성된 참조는 아직 데이터베이스에 저장되지 않은 상태
    const newChannelRef = doc(channelCollection)

    //새 문서의 ID를 추출한다.
    const id = newChannelRef.id

    //새 채널 데이터를 객체로 구성
    const newChannel ={
        id,                 //새로 생성된 문서의 고유 ID
        title,              //채널 제목
        description,        //채널 설명
        createdAt:Date.now() //생성 시간(현재 타임스탬프)
    }

    //FireStore에 새 문서를 생성하고 데이터 저장
    //setDoc(newChannelRef, newChannel)
    //newChannelRef가 가리키는 경로에 newChannel 객체를 저장
    await setDoc(newChannelRef, newChannel)

    //생성된 문서의 ID를 반환
    return id;
}

export const createMessage = async ({channelId, message}) =>{
    //특정 채널의 메시지 컬렉션 안에 새로운 메시지 문서의 레퍼런스를 생성
    const docRef = doc(db, `channels/${channelId}/messages`,message._id);

    //생성된 문서 레퍼런스에 메시지 데이터를 저장
    //기존 메시지 객체의 모든 속성을 복사하고
    //createdAt필드를 현재 시간으로 추가
    await setDoc(docRef, {
        ...message, // 메시지 내용
        createdAt: Date.now(), // 현재 시간을 타임스탬프로 추가
    });

    console.log(`Message created with ID: ${docRef.id}`);
}
