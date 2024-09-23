import { BrowserRouter,Routes, Route } from "react-router-dom";

import About from "./About";
import Contact from "./Contact";
import Home from "./Home";



const Router = () => {
  return (
    <>
    <Routes>
      <Route path="/" Component={Home}></Route>
      <Route path="/contact" Component={Contact}></Route>
      <Route path="/about" Component={About}></Route>
    </Routes>
    </>
    
  )
}

export default Router

