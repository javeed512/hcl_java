


import React from 'react'

function Update() {


        const updateApi =  ()=>{


            fetch("http://localhost:3000/posts/1",
            {
                method: 'PUT',
                body: JSON.stringify({
                    id:1,
                    title:"Football World Cup",
                    author:"Messi"
                }
                ),
                headers: {
                    "Content-Type": 'application/json'
                }
            })
            .then(res=>res.json())
            .then(data => console.log(data));
                



        }





  return (
    <div>
      
            <button type='submit'   className='btn btn-success'  onClick={updateApi}>Update Data</button>


    </div>
  )
}

export default Update;
