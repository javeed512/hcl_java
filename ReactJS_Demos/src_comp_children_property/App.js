
import './App.css';
import Pass from './Pass';

import Fail from './Fail';

import Student from './Student';

function App() {

    const marks = 95;
    


  return (
    <>
    <h1 className='App'>Welcome to ReactJS</h1>
 
 
    {/* { 5 > 3  &&  <h1>Yes 5 Greater than 3 </h1> }    */}

      

      { (marks > 60)   ? <Pass /> : <Fail />}


       <Student name="charan">
        <h1 style={{color:"red"}}>Hi I am Charan</h1>
        <Fail></Fail>
       </Student>


    </>

  );
}

export default App;
