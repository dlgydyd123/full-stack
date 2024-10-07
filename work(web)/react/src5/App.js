import logo from './logo.svg';
import React ,{useState} from 'react';
import './App.css';
import Sol1 from './Sol1';
import MyComponent from './UseEffectTest';
import Sol2 from './Sol2';
import Sol3 from './Sol3';

function App() {

  return (
    <div className="App">
      <Sol1 />
      <MyComponent />
      <Sol2 />
      <Sol3 />
    </div>
  );
}

export default App;
