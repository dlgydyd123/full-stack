import logo from './logo.svg';
import './App.css';
import React from 'react';
import { Routes, Route } from 'react-router-dom'
import Categories from './Categories';
import Products from './Products';
import ProductDetail from './ProductDetail';

function App() {
  return (
    <Routes>
      <Route path="/categories" element={<Categories />} />
      <Route path="/categories/:categoryId" element={<Products/>}/>
      <Route path="/categories/:categoryId/products/:productId" element={<ProductDetail />} />
    </Routes>
  );
}

export default App;
