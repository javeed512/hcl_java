

import React from 'react'
import { useRef , useState , useEffect } from 'react';

function UseRefDemo1() {
    const [inputValue , setInputValue]=useState("");
    const count=useRef(0);
   
    useEffect(()=>
    {
      count.current=count.current+1;
    })
   
   //const fun = (e)=>setInputValue(e.target.value);
   
     return (
       <div>
         <input type="text" value={inputValue} onChange={(e)=>setInputValue(e.target.value)}/>
         <h1>Count Render :{count.current}</h1>
       </div>
     )
}

export default UseRefDemo1
