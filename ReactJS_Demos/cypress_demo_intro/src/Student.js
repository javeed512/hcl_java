


import React from 'react'

function Student() {

        function handle(){

                console.log('button clicked , event handled')
             

        }

  return (
    <div>
        <h1 id="id1">Welcome</h1>

           UserName: <input type="text" name="username"/> <br/><br/>
           Password: <input type="text" name="password"/> <br/><br/>

        <button type="submit" name="login" onClick={handle}>Login</button>
    </div>
  )
}

export default Student
