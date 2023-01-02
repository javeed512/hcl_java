


function update(){
    fetch("http://localhost:3000/employees/102",
    {
        method: 'PUT',
        body: JSON.stringify({
            id: 102,
            ename: "King khan",
            salary: 550000,
            doj:"2023-01-01"
        } 
        ),
        headers: {
            "Content-Type": 'application/json'
        }
    })
    .then(res=> console.log(res.status))
   
}


