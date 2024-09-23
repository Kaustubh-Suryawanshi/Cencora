interface Keypair{
  key: number;
  value: string;
}

let kv1:Keypair={key:1,value:"Kaustubh"};
console.log(kv1);


//interface as function type
interface keyvalueprocessor{
  (key:number,value:string):void;
}

function addkeyval(key:number,value:string):void{
  console.log("Key:"+key+" "+"value: "+value);
}

let kv2:keyvalueprocessor=addkeyval;
kv2(101,"Kaustubh");


//interface as Array Type
interface NumList{
  [index:number]:number;
}

let nums: NumList=[1,2,3];
console.log(nums[0]);

interface stringIndex{
  [index:string]:string;
}

let strArr:stringIndex={};
strArr["ts"]="typescript";
console.log(strArr);


//Optional Property
interface Employee{
  empCode: number;
  empName: string;
  empDept?: string;
}

let empObj1: Employee={
  empCode:1,
  empName:"hello"
}

let empObj2: Employee={
  empCode:2,
  empName:"Cencora",
  empDept:"eComm"
}

console.log(empObj1.empCode+" "+empObj1.empName);
console.log(empObj2);


//readonly property
interface Citizen{
  name: string;
  readonly SSN: number;
}

let personObj: Citizen = {SSN: 11055444, name: 'James Bond'}

personObj.name='steve smith';
// personObj.SSN= '333666888'  //compile error


//Extending interfaces
interface Person{
  name: string;
  gender: string;
}

interface employee extends Person{
  empCode: number;
}

let empObj: employee ={
  empCode:1,
  name:"Kaustubh",
  gender:"male"
}
console.log(empObj);

//implementing interfaces

interface IEmp{
  empCode :number;
  name: string;
  getSalary:(number)=>number;
}

class Emp implements IEmp{
  empCode: number;
  name: string;

  constructor(code :number, name:string){
    this.empCode=code;
    this.name=name;
  }
  getSalary(empCode: number): number{
    return 20000;
  }
}

let emp=new Emp(1,'steven');
console.log(emp.empCode+" "+emp.name+" "+emp.getSalary(1));
