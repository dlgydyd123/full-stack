import logo from './logo.svg';
import './App.css';
import Parent from './props_drilling/Parent';
import { UserProvider } from './props_drilling/UserContext';
import { useContext } from 'react';
import ThemeSwicher from './theme/ThemeSwitcher';
import { ThemeContext } from './theme/ThemeContext';

function App() {
  // const user = { name: 'John Doe', age: 30 }
  const {isDarkMode} =useContext(ThemeContext)
  return (
    <div style={{
      backgroundColor: isDarkMode ? '#333' : '#fff',
      color: isDarkMode ? '#fff' : '#000',
      height: '100vh',
      display: 'flex',
      justifyContent: 'center',
      alignItems: 'center',
   }}>
      {/* <UserProvider>
        <Parent />
      </UserProvider> */}

      <h1>{isDarkMode ? '다크모드' : '라이트모드'}</h1>
      <ThemeSwicher />
    </div>
  );
}

export default App;
