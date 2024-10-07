import React, {createContext, useState} from "react";

export const ThemeContext = createContext();


export const ThemeProvider = ({children}) => {
    const[isDarkMode,setISDarkMode] = useState(false);

    const toggleTheme = () => {
        setISDarkMode(prevMode => ! prevMode)
    }

    return(
        <ThemeContext.Provider value={{isDarkMode,toggleTheme}}>
            {children} 
        </ThemeContext.Provider>
        )
}