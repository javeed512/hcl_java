

import React from 'react'
import { UserContext } from './App'


   

function ComponentC() {
  return (
    <div>
      
      <h1>This is Component C </h1>

    <UserContext.Consumer>

        {(user)=>{

                console.log(user)
                return (<h1>User Details: {user.id}  {user.username}  {user.password}</h1>)


        }}


    </UserContext.Consumer>

    </div>
  )
}

export default ComponentC
