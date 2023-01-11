

import React from 'react'

function Student(props) {
  return (
    <div>
        <h2>{props.name}</h2>
        <h1>Student Child: {props.children} </h1>
      
    </div>
  )
}

export default Student
