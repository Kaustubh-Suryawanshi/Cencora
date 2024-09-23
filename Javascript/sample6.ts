enum Status{
  Active='active',
  deactivate=1,
  pending
}

console.log(Status.Active)
console.log(Status[Status['deactivate']+1])

