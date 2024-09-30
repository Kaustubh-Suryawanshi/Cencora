const {version} = require('os')
const EventEmitter  = require('events')
const evenEmitter= new EventEmitter();

evenEmitter.on('demoEvent',(data)=>{
  console.log('demoEvent was triggered with data: ',data);
});


evenEmitter.emit('demoEvent',{name:'Node js',version:'20.0.0'});

evenEmitter.once('demo2Event',()=>{
  console.log('First');
});

evenEmitter.on('demo2Event',()=>{
  console.log('Second');
});

evenEmitter.emit('demo2Event');
evenEmitter.emit('demo2Event');
