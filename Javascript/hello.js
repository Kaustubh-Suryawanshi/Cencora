const arr=["apple","banana","grapes",true,2002]
let a=prompt("Enter element")
for (let index = 0; index < arr.length; index++) {
  if(a == arr[index]){
    console.log("Element found at:"+index)
    break;
  }
  
  
}