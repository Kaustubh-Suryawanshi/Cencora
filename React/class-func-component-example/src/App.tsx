import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ClassComp from './components/ClassComp'
import FunctionComp from './components/FunctionComp'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ClassComp empname='Kaustubh' age={21}/>
      <FunctionComp stname='Tanaya' age={22} />
        
    </>
  )
}

export default App
