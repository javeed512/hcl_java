

import React from 'react'
import ComponentB from './ComponentB'

function ComponentA(props) {
  return (
    <div>

        <h1>Hello From ComponentA  {props.name}</h1>
        <ComponentB name={props.name}></ComponentB>
      
    </div>
  )
}

export default ComponentA
