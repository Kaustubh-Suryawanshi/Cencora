var kv1 = { key: 1, value: "Kaustubh" };
console.log(kv1);
function addkeyval(key, value) {
    console.log("Key:" + key + " " + "value: " + value);
}
var kv2 = addkeyval;
kv2(101, "Kaustubh");
var nums = [1, 2, 3];
console.log(nums[0]);
var strArr = {};
strArr["ts"] = "typescript";
console.log(strArr);
var empObj1 = {
    empCode: 1,
    empName: "hello"
};
var empObj2 = {
    empCode: 2,
    empName: "Cencora",
    empDept: "eComm"
};
console.log(empObj1.empCode + " " + empObj1.empName);
console.log(empObj2);
var personObj = { SSN: 11055444, name: 'James Bond' };
personObj.name = 'steve smith';
var empObj = {
    empCode: 1,
    name: "Kaustubh",
    gender: "male"
};
console.log(empObj);
var Emp = /** @class */ (function () {
    function Emp(code, name) {
        this.empCode = code;
        this.name = name;
    }
    Emp.prototype.getSalary = function (empCode) {
        return 20000;
    };
    return Emp;
}());
var emp = new Emp(1, 'steven');
console.log(emp.empCode + " " + emp.name + " " + emp.getSalary(1));
