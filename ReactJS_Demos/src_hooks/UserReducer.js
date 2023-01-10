

import React, { useReducer } from 'react'

const initialState=0;
const reducer=(state,action)=>
{
    switch(action)
    {
        case 'increment': return state+1;
        case 'decrement': return state-1;
        case 'reset': return initialState;
        default: return state;
    }
}



function UserReducer() {

      const [count,dispatch]  =     useReducer(reducer,initialState);  // reducer(state,action) callback with 


  return (
    <div>
           <div>
            <h1>Count : {count}</h1>
            <button onClick={()=>dispatch('increment')}>Increment</button>
            <button onClick={()=>dispatch('decrement')}>Decrement</button>
            <button onClick={()=>dispatch('reset')}>Reset</button>
           
        </div>


      
    </div>
  )
}

export default UserReducer
