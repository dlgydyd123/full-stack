package ex01_interface;

public class MicMain {
	public static void main(String[] args) {
		System.out.println("---TjMic 객체---");
		TjMic tj = new TjMic();
		tj.connect();
		tj.music();
		tj.sing();

		System.out.println("--- TjMic객체를 BluetoothMic로 타입 변환");
		BluetoothMic bm = tj;
		bm.connect();
		bm.music();
		bm.sing();

		System.out.println("--- TjMic객체를 MicroPhone타입으로 변환");
		MicroPhone m = tj;
		m.sing();
		// m.connect();
		// m.music();

		System.out.println("--- TjMic객체를 Speaker타입으로 변환");
		Speaker s = tj;
		s.music();
		// s.connect();
		// s.sing();
	}

}
