import React, { Component } from "react";

interface IState{
  bookname: string;
  author: string;
}

interface Iprops{
  empname: string;
  age: number;
}

export default class ClassComp extends Component<Iprops,IState>{
  constructor(props:Iprops){
    super(props);
    this.state={
      bookname:"React_JS",
      author: "Orielly"
    }
  }
  render() {
    const {empname,age}=this.props;
    const {bookname, author}=this.state;
    return(
      <>
      <h1>This is Class Component</h1>
      <h2>Class comp Emp values are</h2>
      <h3>Emp name is: <strong>{empname}</strong></h3>
      <h3>Emp age is: <strong>{age}</strong> </h3>
      <br></br>

      <h2>Class comp state values are</h2>
      <h3>Book name is: <strong>{bookname}</strong></h3>
      <h3>Author is: <strong>{author}</strong></h3>

      </>
    )
  }

}

