


import React , {useRef} from 'react'


function Ref_useRefDemo() {

    const inputRef=useRef("");

    const handleClick=()=>
    {
           // e.preventDefault();

        inputRef.current.value="Alan";
        inputRef.current.focus();
        inputRef.current.style.color="red";
   
        console.log(inputRef.current)
        console.log(inputRef.current.value)
    }
  
  
    return (
      <div>
       <input type="text" ref={inputRef}/>
       <button onClick={handleClick}>Handle Input</button>
      </div>
    )
}

export default Ref_useRefDemo
