
import React, { Component } from 'react'

import  mystyle  from './demo.module.css'

export default class Product extends Component {

    // state inside class

    
    state = {
        pid:101,
        pname:"laptop",
        price: 550000,
        productColor : this.props.color

    }



    constructor(props){

            super(props); // always 

          // this.state.price = 99000; 

        



    }



  render() {
    return (
      <div className={mystyle.cls2} >
        
         <h1 style={{color:"red"}}> Product Details : {this.state.pid} {this.state.pname}  {this.state.price}  {this.state.productColor}  </h1>

            <h2 className={mystyle.cls1}>Product Color : {this.props.color}</h2>

      </div>
    )
  }
}
