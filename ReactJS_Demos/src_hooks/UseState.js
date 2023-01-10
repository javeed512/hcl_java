

import React, { useRef, useState } from 'react'

function UseState(props) {

    const [name,setName] = useState("");


        const ref =  useRef();

        function update(){


          // render the output after updating state
           //  setName("Javeed");

            ref.current = "Charan"

            console.log(name);

            
        }




  return (
    <div>
      
        <h1>Name: {name}</h1>

          <button type="submit" onClick={update} >Update</button>

        <h1>Updated Name: {name}</h1>


    </div>
  )
}

export default UseState
