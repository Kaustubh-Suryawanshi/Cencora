var Status;
(function (Status) {
    Status["Active"] = "active";
    Status[Status["deactivate"] = 1] = "deactivate";
    Status[Status["pending"] = 2] = "pending";
})(Status || (Status = {}));
console.log(Status.Active);
console.log(Status[Status['deactivate'] + 3]);
