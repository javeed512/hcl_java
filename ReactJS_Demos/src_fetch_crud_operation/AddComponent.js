

import React, { Component } from 'react'

export default class AddComponent extends Component {


    constructor(props){


            super(props);

           this.state = {

                    id: "" ,
                    title: "",
                    author:"" 

           } 


            // create refs

                this.idRef = React.createRef();
                this.titleRef = React.createRef();
                this.authorRef = React.createRef();


    }


     addPostApi =  (e)=>{

            e.preventDefault();
            
            //set the data of text field to state.

//this.setState({id:this.idRef.current.value , title: this.titleRef.current.value,author: this.authorRef.current.value})

        console.log(this.state)

        fetch("http://localhost:3000/posts/",
        {
            method: 'POST',
            body: JSON.stringify(
                    {
                       
                        title:this.titleRef.current.value,
                        author:this.authorRef.current.value

                    }
            ),
            headers: {
                "Content-Type": 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data => console.log(data));
            

            console.log(this.titleRef.current.value);
            alert("Record Added to DB")


    }





  render() {
    return (
      <div >

            <form  className='container col-md-5' onSubmit={this.addPostApi}>
{/* 

<div className='form-group'> <label>Enter Id</label> <input type="text" className='form-control'  ref={this.idRef} /> </div> */}


<div className='form-group'> <label>Enter Title</label> <input type="text" className='form-control'  ref={this.titleRef} /> </div>


<div className='form-group'> <label>Enter Author</label> <input type="text" className='form-control'  ref={this.authorRef} /> </div>


            <button type="submit" className='btn btn-primary'  >Post</button>

            </form>



        
      </div>
    )
  }
}
