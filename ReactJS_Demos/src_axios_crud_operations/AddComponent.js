

import React, { Component, useState } from 'react'

import axios from 'axios'
 



export default class AddComponent extends Component {
  

    constructor(props)
    {
        super(props);

        this.state={
            id:"",
            title:"",
            author:""
        }
    }

    changeHandler=(e)=>
    {
        this.setState({[e.target.name]:e.target.value})
    }

    submitHandler=e =>
    {
        e.preventDefault();
        console.log(this.state);
        axios.post('http://localhost:3000/posts',this.state)
        .then(response=>
            {
                console.log(response);
            })
            .catch(error=>
                {
                    console.log(error)
                })           
    }

  render() {
    const {id,title,author}=this.state;

    return (
      <div className='container col-md-4'>
            <h2>Add Form</h2>

          <form   onSubmit={this.submitHandler}>
            <div>
             Enter ID:   <input type="text" name="id"  className='form-control'
                value={id}
                onChange={this.changeHandler}/>
            </div>
            <div> 
            Enter Title:     <input type="text" name="title"   className='form-control'
                value={title}
                onChange={this.changeHandler}/>
            </div>
            <div>
            Enter Author:    <input type="text" name="author"  className='form-control bm-8'
                value={author}
                onChange={this.changeHandler}/>
            </div>
            <button type="submit"  className='btn btn-primary '>submit</button>
          </form>
      </div>
    )
  }



}
