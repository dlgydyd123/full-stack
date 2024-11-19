import React from "react";
import App from "./App";
import Login from "./users/Login";
import Signup from "./users/Signup";
import {BrowserRouter, Routes, Route} from 'react-router-dom';


function AppRouter(){
    return(
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/main" element={<App/>}></Route>
                    <Route path="/" element={<Login/>}></Route>
                    <Route path="/signup" element={<Signup/>}></Route>
                </Routes>
            </BrowserRouter>
        </div>
    )
}



export default AppRouter;
