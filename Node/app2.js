const fs= require('fs');

fs.readFile('file.txt', 'utf8',(err,data)=>{
  if(err) throw err;
  console.log(data);
})

// const data = fs.readFileSync('file.txt','utf8');
// console.log(data);

// fs.writeFile('file.txt','Hello and welcome3',(err)=>{
//   if(err) throw err;
//   console.log('File Written');
// })

fs.writeFileSync('file.txt','Hello and welcome4');
console.log('File Written');


