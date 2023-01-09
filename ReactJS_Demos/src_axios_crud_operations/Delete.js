


import React from 'react'
import axios from "axios"

function Delete(props) {

       

        const deleteApi = ()=>{

            axios.delete("http://localhost:3000/posts/"+props.pid)
            .then((res)=>{ console.log(res.status); alert("Record with Pid " + props.pid +" deleted")  })
          

        }


  return (
    <div>
      

      <button type="submit"  className='btn btn-danger' onClick={deleteApi} value={props.pid} >Delete</button>



    </div>
  )
}

export default Delete
