import React,{useState} from "react";
interface Iprops{
  stname: string;
  age: number;
}

interface IState{
  bookname: string;
  author: string;
}

 const FunctionComp:React.FC<Iprops>=({stname, age})=>{
  const [state] = useState<IState>({bookname:"Complete Ref", author:"Herbert Shield"})
  return(
    <>
    <h1>This is Function Component</h1>
      <h2>Func comp Student values are</h2>
      <h3>Student name is: <strong>{stname}</strong></h3>
      <h3>Student age is: <strong>{age}</strong> </h3>
      <br></br>

      <h2>Func comp state values are</h2>
      <h3>Book name is: <strong>{state.bookname}</strong></h3>
      <h3>Author is: <strong>{state.author}</strong></h3></>
  )
}
export  default FunctionComp