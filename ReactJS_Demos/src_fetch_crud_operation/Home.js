

import React from 'react'
import { BrowserRouter, Link, Routes , Route } from 'react-router-dom'
import Add from './Add'
import AddComponent from './AddComponent'
import Get from './Get'
import Update from './Update'

function Home() {
  return (
    <div>




    <BrowserRouter>

           
    <nav className="navbar  bg-dark">

        <Link  to="/" >Home</Link>
        <Link  to="/add" >Add</Link>
        <Link  to="/update" >Update</Link>

    </nav>


        
        <Routes>

            <Route exact path="/" element={<Get/>}></Route>

            <Route path="/add"  element={<AddComponent />} > </Route>

            <Route path="/update"  element={<Update/>} > </Route>


        </Routes>
    
    
    
    </BrowserRouter>



     

      
    </div>
  )
}

export default Home
