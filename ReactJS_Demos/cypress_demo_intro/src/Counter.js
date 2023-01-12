

import React, { useState } from 'react'

function Counter() {

        const [count,setCount] = useState(0);



        function  handleIncrement(){

                setCount(count+1)

        }


        function  handleDecrement(){

            setCount(count - 1)

    }



  return (
    <div>
            <h1 id="hid">Hello Friends</h1>
            <h1 id="countId">Count: {count}</h1>
      
        <button type="submit"  onClick={handleIncrement} >Plus</button> <br/>
        <button type="submit"  onClick={handleDecrement} >Minus</button>



    </div>
  )
}

export default Counter
