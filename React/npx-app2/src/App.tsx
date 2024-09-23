import React from 'react';
import logo from './logo.svg';
import './App.css';
import Dashboard from "./Components/Dashboard"
import Todo from "./Components/Todo"
import Sign_in from "./Components/Sign_in"

function App() {
  return (
    <>    
    {/* <div className="App">
      <h2>Hello React</h2>
      <Dashboard name='Kaustubh' votes={10000}> <span>and won the election</span></Dashboard>
      <Dashboard name='Tanaya' votes={0}/>
      <Dashboard name='Pratham' votes={100}/> 

    </div> */}
    <div>
      <h1>Log in </h1>
      <Sign_in/>
    </div>
    </>
  );
}

export default App;
