import React from "react";
import { createStackNavigator } from "@react-navigation/stack";
import ChatList from "../screens/ChatListScreen";
import Chat from "../screens/ChatDetailScreen";


const ChatStack = createStackNavigator();

const ChatStackNavigator =() =>{
    return(
        <ChatStack.Navigator>
            <ChatStack.Screen name="ChatList" component={ChatList}/>
            <ChatStack.Screen  name="Chat" component={Chat}/>
        </ChatStack.Navigator>
    )
}

export default ChatStackNavigator