import { Action,Dispatch } from "@reduxjs/toolkit";
import { ActionType } from "../action-types";


console.log('In action Creators')
export const depositMoney =(amount: number)=>{
  return(dispatch:Dispatch)=>{
    dispatch({
      type: ActionType.DEPOSIT,
      payload: amount
    })
  }
}

export const withdrawMoney =(amount: number)=>{
  return(dispatch:Dispatch<Action>)=>{
    dispatch({
      type: ActionType.WITHDRAW,
      payload: amount
    })
  }
}

export const bankruptMoney =()=>{
  return(dispatch:Dispatch<Action>)=>{
    dispatch({
      type: ActionType.BANKRUPT,
    })
  }
}