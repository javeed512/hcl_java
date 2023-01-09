

import React from 'react'

function Add() {


        const addApi =  ()=>{


            fetch("http://localhost:3000/posts",
            {
                method: 'POST',
                body: JSON.stringify({
                    id:6,
                    title:"Java",
                    author:"Javeed"
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
      
            <button type='submit'  className='btn btn-primary'   onClick={addApi}>Add Data</button>


    </div>
  )
}

export default Add
