function greet(greeting) {
    var names = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        names[_i - 1] = arguments[_i];
    }
    return greeting + " " + names.join(",") + "|";
}
console.log(greet("Hello", "Steve", "Bill"));
console.log(greet("Kaustubh", "Suryawanshi"));
function sum() {
    var nums = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        nums[_i] = arguments[_i];
    }
    var s = 0;
    nums.forEach(function (element) {
        s += element;
    });
    return s;
}
console.log(sum(21, 34, 556, 78, 4, 3, 6));
