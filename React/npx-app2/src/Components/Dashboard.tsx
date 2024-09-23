import React from 'react'


type DashBoardProps={
  name:string;
  votes:number;
  children?:React.ReactNode;
}

//or
// interface DashBoardProps{
//   name:string;
//   votes?:number;
// }
const Dashboard:React.FC<DashBoardProps>=({name,votes,children})=>{
  return (
    <div style={{border:"2px solid",margin:"2px",width:"50%",textAlign :'center'}}>{name}'s Dashboard!!
      Name is: {name} and Vote count is:{votes} {children}
    </div>
  )
}
export default Dashboard