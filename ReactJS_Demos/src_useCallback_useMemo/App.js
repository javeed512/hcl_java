
import { useCallback, useMemo, useState } from 'react';
import './App.css';

import Student from './Student';
import UseMemo from './UseMemo';


    const functionsCounter = new Set();


function App() {

    const[age,setAge] = useState(18);
    const[sal,setSalary] = useState(1000);

   
 
  const incrementAge =  useCallback(()=>{

    console.log("incrementAge() is called..")
      setAge(age+1);
    } , [age]  );

        

 
    // const decrementAge = ()=>{

    //   console.log("decrementAge() is called..")
    //   setAge(age - 1);

    //   } ;


      const incrementSalary = useCallback(()=>{

          console.log("incrementSalary() is called..")
          setSalary(sal + 1000);

      },[sal]);

      


      functionsCounter.add(incrementAge);
     // functionsCounter.add(decrementAge);
      functionsCounter.add(incrementSalary);

        console.log(functionsCounter)

        console.log("regenrating count "+functionsCounter.size)
      

  return (
    <>
     <h1 className='App'>Welcome to ReactJS</h1>
      <Student  text="age"  count={age}   salary={sal}></Student>

      <button  onClick={incrementAge}>IncrementAge</button>
      {/* <button  onClick={decrementAge}>DecrementAge</button> */}

      <button  onClick={incrementSalary}>Increase Salary</button>

    
    <UseMemo />
    
    </>
   
  );
}

export default App;
