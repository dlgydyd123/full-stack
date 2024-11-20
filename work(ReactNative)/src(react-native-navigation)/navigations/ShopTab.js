import React from "react";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { HomeScreen, CartScreen, ProfileScreen } from "../screens/ShopTabScreen";
import {MaterialCommunityIcons} from "@expo/vector-icons";

const ShopTab = createBottomTabNavigator();

const TabIcon =({name, size, color}) =>{
    return(
        <MaterialCommunityIcons name={name} size={24} color={color}/>
    )
}



const ShopTabNavigator =() =>{
    return(
        <ShopTab.Navigator initialRouteName="HomeScreen">
            <ShopTab.Screen 
                name="HomeScreen" component={HomeScreen}
                options={{tabBarIcon : props =>TabIcon({...props, name: 'home' }),
                          tabBarActiveTintColor: 'blue',
                          tabBarInactiveTintColor: 'gray'  
                          }}/>
            <ShopTab.Screen
                 name="CartScreen" component={CartScreen}
                 options={{tabBarIcon : props =>TabIcon({...props, name: 'cart'}),
                            tabBarActiveTintColor: 'blue',
                            tabBarInactiveTintColor: 'gray'   
                            }}/>
            <ShopTab.Screen 
                name="ProfileScreen" component={ProfileScreen}
                options={{tabBarIcon : props =>TabIcon({...props, name: 'account'}),
                            tabBarActiveTintColor: 'blue',
                            tabBarInactiveTintColor: 'gray'  
                            }}/>
        </ShopTab.Navigator>
    )
}

export default ShopTabNavigator
