import { useState } from 'react'
import './App.css'
import { useDispatch, useSelector } from 'react-redux';
import { bindActionCreators } from '@reduxjs/toolkit';
import { actionCreators,state } from './state';

function App() {
const dispatch = useDispatch();
const {depositMoney,withdrawMoney,bankruptMoney} =bindActionCreators(actionCreators,dispatch);
const amount =useSelector((state:state)=>state.bank)
console.log('In main app')
  return (
    <>
      <div className='App'>
        <h1>{amount}</h1>
        <button onClick={()=>depositMoney(2000)}>Deposit</button>
        <button onClick={()=>withdrawMoney(500)}>Withdraw</button>
        <button onClick={()=>bankruptMoney()}>Bankrupt</button>
      </div>
      </>
  )
}

export default App
