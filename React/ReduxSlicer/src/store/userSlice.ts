import { createSlice, PayloadAction } from "@reduxjs/toolkit";

interface UserState{
  users: string[];
}

const initialState: UserState={
  users:[]
};

const userSlice = createSlice ({
  name: 'users',
  initialState,
  reducers:{
    setUsers(state, action: PayloadAction<string[]>){
      state.users =  action.payload;
    },
  },
});

export const {setUsers}= userSlice.actions;
export default userSlice.reducer;