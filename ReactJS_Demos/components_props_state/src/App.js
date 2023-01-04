
import React from 'react';
import './App.css';
import Employee from './Employee';
import Product from './Product';
import Student from './Student';

function App() {
  return (
    <React.Fragment>
   
    <h1 className='App'>Welcome to ReactJS</h1>
    {/* <Student sid="101" sname="javeed" fee="5000" ></Student>
    <Student sname="tom" ></Student>
    <Student sname="king"></Student>

    <Employee   ename="smith" salary="50000"></Employee> */}

    <Product color="Dark" ></Product>

    </React.Fragment>
  );
}

export default App;
