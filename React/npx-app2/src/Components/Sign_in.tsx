import React, { useState } from 'react'

const Sign_in = () => {
  const [name,setName]=useState("")
  const [pass,setPass]=useState("")
  const [Uname,setUname]=useState("")
  const dispName=()=>{
    setUname(`Welcome,${name}`)
    setName("")
    setPass("")
    
  }
  return (
    <div>
      <input onChange={e => setName(e.target.value)} type='text' placeholder='enter name' value={name}/><br></br>
      <input onChange={e => setPass(e.target.value)} type='password' placeholder='enter password' value={pass}/><br></br>
      <button onClick={dispName}>sign-in</button>
      <h2>{Uname}</h2>
      

    </div>
  )
}

export default Sign_in
