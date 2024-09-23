import React, { useState } from 'react'

const Todo = () => {
  const [todo,setTodo]=useState("")
  const [todoList,setTodoList]=useState<string[]>([])
  const addTodo=()=>{
    setTodoList([...todoList,todo])
    setTodo("")
  }

  const handlechange=(e:React.ChangeEvent<HTMLInputElement>)=>{
    setTodo(e.target.value)
  }
  return (
    <div>
      
      <input 
      onChange={e => setTodo(e.target.value)} // or onChange={handlechange}
       type='text'
       placeholder='type-todo' 
       value={todo}/>
      {/* <button onClick={()=> console.log(todo)}>Add todo</button> */}
      <button onClick={addTodo}>Add Todo</button>
      <ul>
          {
            todoList.map(item=>{
              return <li>{item}</li>
            })
 
 
          }
 
      </ul>
    </div>
  )
}

export default Todo
