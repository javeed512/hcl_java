

import React, { Component } from 'react'

export default class UncontrolledForm extends Component {

    constructor(props)
    {
            super(props);
            this.state={
                    username:"",
                    password:"",
                    city:""
            }
            //create ref
            this.uname=React.createRef();
             this.pwd=React.createRef();
             this.cityText=React.createRef();

    }

     handleSubmit=(e)=>
        {
               e.preventDefault();
               //set the data of text field to state.
               this.setState({username:this.uname.current.value,password:this.pwd.current.value ,city:this.cityText.current.value  });
      
                console.log(this.uname.current.value)
      
            }

        componentDidMount=()=>
        {
           this.uname.current.focus();
        }


  render() {
    return (
      <div>

                        <div className="container col-md-4">
                           <h1>You Enter Name : {this.state.username}</h1>
                           <h1>You Password : {this.state.password}</h1>
                           <form onSubmit={this.handleSubmit}>
                            User  Name : <input type="text" className='form-control'    ref={this.uname}/>
                            Password : <input type="text" className='form-control'    ref={this.pwd}/>
                            City : <input type="text" className='form-control'   ref={this.cityText}/>  
                             
                             
                              <button type="submit" className='btn btn-success'   >Submit</button>
                           </form>
                        </div>
        
      </div>
    )
  }
}

