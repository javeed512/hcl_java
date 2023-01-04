import React, { Component } from "react";

export default class Employee extends Component {

     x = 100;
     data = "";

    constructor(){
        super();

        this.x = 300;

        

    }

      f1 = ()=>{

            this.data = this.props.ename;

        

    }



        render(){

               
                return(
                    <>
                    {this.f1()}
                  <div> Employee Name : {this.data} </div> <br></br>
                <h1>Welcome to Employee Class Component {this.x}</h1>
                <h2>EName: {this.props.ename}  and Salary: {this.props.salary}</h2>
                    </>
               
                );
        }


}