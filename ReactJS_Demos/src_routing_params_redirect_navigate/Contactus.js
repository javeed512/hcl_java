
import React from 'react'
import {  useParams } from 'react-router-dom'


function Contactus() {

    let  {id} = useParams();

  return (
    <div>
      
<h1>Contactus Page</h1>
<h2>Contact for id : {id}</h2>




    </div>
  )
}

export default Contactus
