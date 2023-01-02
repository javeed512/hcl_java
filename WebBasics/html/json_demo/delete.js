

function deleteEmp(){

    fetch("http://localhost:3000/employees/106",
    {
        method: 'DELETE',
       
    })
    .then(res=> console.log(res.status))


}