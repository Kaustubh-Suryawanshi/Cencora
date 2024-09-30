import { createSlice, PayloadAction } from "@reduxjs/toolkit";

interface OrderState{
  orders:string[];
}

const initialState: OrderState={
  orders:[]
}

const orderSlice = createSlice({
  name:'orders',
  initialState,
  reducers:{
    setOrders(state, action:PayloadAction<string[]>){
      state.orders = action.payload;
    }
  }
});

export const {setOrders} = orderSlice.actions;
export default orderSlice.reducer;