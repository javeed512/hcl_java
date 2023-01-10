


import React, { useEffect, useState } from 'react'

function UserEffect() {

    const [count,setCount] = useState(0); 


        const increase =  () =>{

                setCount(count+1);

        }

                useEffect(()=>{


                        document.title = `You Clicked ${count} times` ;
                        // any logics after rendering page

                },[count]);




  return (
    <div>
        
        <h1> Count : {count} </h1>

        <button type="button" onClick={increase}>Increase</button>


    </div>
  )
}

export default UserEffect
