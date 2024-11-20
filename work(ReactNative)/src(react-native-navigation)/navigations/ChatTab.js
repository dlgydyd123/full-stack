import React from "react";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { FriendScreen, SettingsScreen } from "../screens/ChatScreen";
import ChatStackNavigator from "./ChatStack";
import { MaterialCommunityIcons } from "@expo/vector-icons";

const ChatTab = createBottomTabNavigator();

const TabIcon = ({ name, size, color }) => {
    return (
        <MaterialCommunityIcons name={name} size={size} color={color} />
    )
}

const ChatTabNavigator = () => {
    return (
        <ChatTab.Navigator>
            <ChatTab.Screen name="FriendScreen" component={FriendScreen}
                options={{
                    tabBarIcon: props => TabIcon({ ...props, name: 'account-supervisor' }),
                    tabBarActiveTintColor: '#F4FA58'
                }}d
            />
            <ChatTab.Screen name="ChatStackNavigator" component={ChatStackNavigator}
                options={{
                    tabBarIcon: props => TabIcon({ ...props, name: 'chat' }),
                    tabBarActiveTintColor: '#F4FA58'
                }}
            />
            <ChatTab.Screen name="SettingsScreen" component={SettingsScreen}
                options={{ tabBarIcon: props => TabIcon({ ...props, name: 'cog' }), 
                 tabBarActiveTintColor : '#F4FA58'
            }}
            />
        </ChatTab.Navigator>
    )
}

export default ChatTabNavigator