
import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import axios from "axios";
import { RootState } from "../store";
import { setUsers } from "../store/userSlice";

const UserList: React.FC=()=>{
  const dispatch = useDispatch();
  const users = useSelector((state: RootState)=> state.users.users);

  useEffect (()=>{
    axios.get("/users").then((response)=>{
      dispatch(setUsers(response.data));
    });
  },[dispatch]);

  return(
    <div>
      <h1>User List</h1>
      <ul>
        {users.map((user,index)=>(
          <li key={index}>{user}</li>
        ))}
      </ul>
    </div>
  );
}
export default UserList