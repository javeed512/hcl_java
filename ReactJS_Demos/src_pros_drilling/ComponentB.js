
import React from 'react'
import ComponentC from './ComponentC'

function ComponentB(props) { 
  return (
    <div>

<h1>Hello From ComponentB {props.name} </h1>

<ComponentC name={props.name}></ComponentC>
      
      
    </div>
  )
}

export default ComponentB
