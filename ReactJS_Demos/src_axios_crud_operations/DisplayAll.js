

import React, { useState } from 'react'

import axios from 'axios'

import Delete from './Delete';


function DisplayAll() {


    const[data,setData]  = useState([]);


 

    function getApi(){

            axios.get("http://localhost:3000/posts")

           .then((response)=>{ setData(response.data);})  // return data if success

            .catch((error)=>{setData(error) }); // handling error in case of failure

    }



return (
<div>

    <button type="submit"  onClick={getApi} className="btn btn-warning" >Display All</button>
    
    {/* <h1>{ JSON.stringify(data)}</h1> */}


    <table  className='table table-striped col-md-4'>
        <thead> <tr><th>Id</th> <th>Title</th>  <th>Author</th> <th>Delete</th>  </tr> </thead>

         <tbody>   {
                    
                    

                    data.map((item)=>{ 

                       

       return  <tr  key={item.id}><td>{item.id}</td> <td>{item.title}</td>  <td>{item.author}</td> <Delete pid={item.id}></Delete>  </tr>



                     })



               } 

            </tbody>

    </table>



  
</div>
)






 
}

export default DisplayAll
