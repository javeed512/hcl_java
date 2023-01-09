
import React, { useState } from 'react'
import Delete from './Delete';

function Get() {

        const[data,setData]  = useState([]);


        function getApi(){

                fetch("http://localhost:3000/posts")
                .then((response)=> response.json())
                .then((jsonData)=>{ console.log(jsonData); setData(jsonData);    });

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

export default Get
