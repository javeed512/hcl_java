
import Aboutus from './Aboutus';
import './App.css';
import Contactus from './Contactus';
import Home from './Home';
import {BrowserRouter,Routes,Route, Link, HashRouter}  from 'react-router-dom';

import Error from './Error';



function App() {
  return (

    <>
    <h1 className='App'>Welcome to ReactJS</h1>
      {/* <BrowserRouter> */}

      <HashRouter>

      <h1>My Website</h1>
      <nav>

        <Link style={{display:"block"}}  to="/">Home</Link>
        <Link style={{display:"block"}}  to="/contactus">ContactUs</Link>
        <Link style={{display:"block"}}  to="/aboutus">AboutUs</Link>
        

     



      </nav>


      
        <Routes>


         <Route  exact path="/"  element={<Home/>} ></Route> 
        <Route   path="/home"  element={<Home/>}></Route>
        <Route   path="/aboutus"  element={<Aboutus/>}></Route>
        <Route   path="/contactus"  element={<Contactus/>}></Route>
        <Route   path="/*"  element={<Error/>}></Route>

        </Routes>
     
  
        </HashRouter>

      {/* </BrowserRouter> */}







  </>
  );
}

export default App;
