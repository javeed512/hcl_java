


import React from 'react'

function Delete(props) {

       

        const deleteApi = ()=>{

            fetch("http://localhost:3000/posts/"+props.pid,{method:'DELETE'})
            .then((res)=>{ console.log(res.status); alert("Record with Pid " + props.pid +" deleted")  })
          

        }


  return (
    <div>
      

      <button type="submit"  className='btn btn-danger' onClick={deleteApi} value={props.pid} >Delete</button>



    </div>
  )
}

export default Delete
