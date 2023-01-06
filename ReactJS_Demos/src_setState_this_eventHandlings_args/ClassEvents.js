
import React, { Component } from 'react'

export default class ClassEvents extends Component {
    
    constructor(props){

            super(props);

        this.validate = this.validate.bind(this);


            this.state = {
                    id:501,
                    name:"Tom",
                    rollno:this.props.sid


            }

           




    }



  validate(){

      console.log("validate method from class is called..");

        console.log(this.state.name +"  "+this.state.id)

       // this = window object inside functions
       // to avoid above process we need to bind(this) inside constructors
    }



    handleClick = ()=>{

            console.log('click event handled ',this);

            this.setState({name:"Javeed"});

    }


    handleEvent=(id)=>
	{
		console.log(id);
	}
	//first handler
	handleArgument=()=>
	{
		this.handleEvent(this.state.id)
	}
        

      handleEventWithCallBack = ()=>{



            this.setState(function(state,props){
                console.log("before "+this.state.name)
                        

                        return {name:"Javeed Sir",id:999};


            });

            

      }  

   

  render() {
    return (
      <div>
        
       

        <h1>Class Component Events</h1>
        <button type="button"  onClick={this.validate}>Validate</button> <br></br>

        <button type="button"  onClick={this.handleClick}>Handle Click</button> <br/>
        
        <h1>Name: {this.state.name} RollNo: {this.state.rollno}  Id: {this.state.id}</h1> <br/>

        
        <button type="button"  onClick={this.handleArgument}>Handle Event With Args</button> <br/><br/>
        
        <button type="button"  onClick={this.handleEventWithCallBack}>Event With Callback Set</button> <br></br>

      </div>
    )
  }
}
