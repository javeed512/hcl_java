

import React, { Component } from 'react'

function HOC(HocComponent) {
  return class extends Component{

            render(){

                return (
                        <div>

                        <HocComponent></HocComponent>

                        </div>


                );


            }


  }
  
}

export default HOC
