
import { createContext } from 'react';
import './App.css';
import ComponentA from './ComponentA';
import ComponentC from './ComponentC';

 const  UserContext =   createContext(); 

function App(props) {

    let user = {id:101,username:"javeed",password:"tiger"}

  return (
    <>
    <h1 className='App'>Welcome to ReactJS</h1>
    <h1>Hi {props.username}  , your total bill amount is Rs. {props.amount}</h1>
 
    <UserContext.Provider value={user}> 

        <ComponentA/>

    </UserContext.Provider>

   

      </>
  );
}

export default App;

export  {UserContext};
