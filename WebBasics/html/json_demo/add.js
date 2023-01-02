

// function add(){



//     fetch('https://localhost:3000/employees', {
//     method: 'POST',
//     headers: {
//         'Accept': 'application/json',
//         'Content-Type': 'application/json'
//     },
//     body: JSON.stringify({ "id":130,"ename":"javeed","salary":90000,"doj":'2022-12-01' })
// })
// .then(response => response.json())
// .then(response => console.log(JSON.stringify(response)))

// }


// add();


function add(){
    fetch("http://localhost:3000/employees",
    {
        method: 'POST',
        body: JSON.stringify({
            id: 103,
            ename: "Ford",
            salary: 55000,
            doj:"2021-05-21"
        }
        ),
        headers: {
            "Content-Type": 'application/json'
        }
    })
    .then(res=>res.json())
    .then(data => console.log(data));
}