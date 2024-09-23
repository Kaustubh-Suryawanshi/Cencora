function greet(greeting:string, ...names: string[]){
  return greeting +" "+names.join(",")+"|";
}

console.log(greet("Hello", "Steve","Bill"));

console.log(greet("Kaustubh","Suryawanshi"));


function sum(...nums:number[]):number{
  let s:number=0;
  nums.forEach(element => {
    s+=element
  });
  return s;

}

console.log(sum(21,34,556,78,4,3,6));
