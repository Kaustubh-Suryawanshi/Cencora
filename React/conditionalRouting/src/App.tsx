import { useState } from 'react'
import './App.css'
import {Route, BrowserRouter as Router, Routes, useNavigate } from 'react-router-dom'
import { Link } from 'react-router-dom'
import Home from './components/Home'
import About from './components/About'
import Dashboard from './components/Dashboard'

//Programmatic Routing
const NavigateButton:React.FC=()=>{
  const navigate = useNavigate();
  const goToDashboard=()=>{
    navigate('/dashboard');
  }
  return <button onClick={goToDashboard}>Go To Dashboard</button>
}

function App() {
  //Programmatic Routing
  return(
  <Router>
  <nav>
    <Link to="/">Home</Link>|<Link to="/about">About</Link>|<Link to="/dashboard">Dashboard</Link>
  </nav>
  <NavigateButton/>
  <Routes>
    <Route path='/' element={<Home/>}/>
    <Route path='/about' element={<About/>}/>
    <Route path='/dashboard' element={<Dashboard/>}/>
  </Routes>
</Router>
  )

  //conditional Routing
  /*const [isAuthenticated, setisAuthenticated] = useState<boolean>(false)

  const handlelogin=()=>setisAuthenticated(true);
  const handlelogout=()=>setisAuthenticated(false);

  return (
    <Router>
      <nav>
        <Link to="/">Home</Link>|<Link to="/about">About</Link>|<Link to="/dashboard">Dashboard</Link>
        <button onClick={isAuthenticated?handlelogout :handlelogin}>
          {isAuthenticated? 'Logout':'Login'}
        </button>
      </nav>

      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/about' element={<About/>}/>
        <Route path='/dashboard' element={isAuthenticated?<Dashboard/>:<Home/>}/>
      </Routes>
    </Router>
  )*/
}

export default App
