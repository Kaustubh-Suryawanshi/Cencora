import React, { createContext, useState } from 'react'
export const UserContext=createContext({
    userID:0,
    updateUserId:(id)=>{},

    userName:'',
    updateUserName:(name)=>{}
})
const UserContextProvider = ({children}) => {
    const [userID, setUserId]=useState(0);
    const [userName, setUserName]=useState('');
    const updateUserId=(id)=>{
        setUserId(id);
    }
    const updateUserName=(name)=>{
        setUserName(name);
    }
  return (
    <UserContext.Provider value={{userID,updateUserId,userName,updateUserName}}>
      {children}
    </UserContext.Provider>
  )
}

export default UserContextProvider
