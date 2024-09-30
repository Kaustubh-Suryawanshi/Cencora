
// -------------HTTP module---------------
//const http = require('http')
// eg 01
/* const server = http.createServer((req,res)=>{
  res.statusCode =200;
  res.setHeader('Content-Type','text/html');
  res.end('<h1>Hello, World!\n</h1>');
});

server.listen(3000,()=>{
  console.log('server started on port 3000')
// })*/

//eg 02
/*http.get('http://jsonplaceholder.typicode.com/posts?id=1',(res)=>{
  let data='';

  res.on('data',chunk=>{
    data+=chunk
  });

  res.on('end',()=>{
    console.log(JSON.parse(data));
  }).on('error',(err)=>{
    console.log('Error:'+ err.message);
  });

});*/




//-----------URL module-----
const url =require('url')

const myURL=new URL('http://jsonplaceholder.typicode.com:8000/posts?id=1');
console.log(myURL.href);
console.log(myURL.hostname);
console.log(myURL.pathname);
console.log(myURL.port);
console.log(myURL.search);
console.log(myURL.searchParams);
console.log(myURL.searchParams.get('id'));


