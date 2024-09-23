var rainbow;
(function (rainbow) {
    rainbow["first"] = "Violet";
    rainbow["second"] = "Indigo";
    rainbow["third"] = "Blue";
    rainbow["fourth"] = "Green";
    rainbow["fifth"] = "Yellow";
    rainbow["sixth"] = "Orange";
    rainbow["seventh"] = "Red";
})(rainbow || (rainbow = {}));
console.log(rainbow.fifth);
console.log(rainbow['sixth']);
