


function  test(){

    


    fetch("http://localhost:3000/employees")
    .then((response)=>{ return response.json()})
    .then((empList)=>{
        console.log(empList);
         document.getElementById("demo").innerHTML= JSON.stringify(empList);
         });


    



}

test();