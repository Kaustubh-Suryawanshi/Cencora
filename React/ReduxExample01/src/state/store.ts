import { createStore, applyMiddleware } from '@reduxjs/toolkit';
 
import reducers from './reducers/index'; // Assuming you have a root reducer
import { thunk } from 'redux-thunk';


console.log('In store.ts')
export const store = createStore(
  //npm install @reduxjs/toolkit all installation
  //npm install @types/react to avoid the errors during runtime
  reducers,
  applyMiddleware(thunk)
)