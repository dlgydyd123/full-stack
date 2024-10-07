import React , {useContext} from 'react'
import { ThemeContext} from './ThemeContext'

function ThemeSwicher(){
    const {isDarkMode,toggleTheme} = useContext(ThemeContext)

    return(
        <div>
            <button onClick={toggleTheme}>
                {isDarkMode ? '라이트모드로 전환' : '다크모드로 전환'}
            </button>
        </div>
    )
}

export default ThemeSwicher