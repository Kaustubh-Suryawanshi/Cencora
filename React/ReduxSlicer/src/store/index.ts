import { configureStore } from "@reduxjs/toolkit";
import userReducer from './userSlice';
import orderReducer from './orderSlice';


const store = configureStore({
  reducer:{
    users: userReducer,
    orders: orderReducer,
  },
});
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;
export default store