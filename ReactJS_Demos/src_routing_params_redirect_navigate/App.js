
import './App.css';

import { Route} from 'react-router'
import Contactus from './Contactus';
import Home from './Home';
import {BrowserRouter as Router , Routes, Link, NavLink } from 'react-router-dom';
import Success from './Success';

function App() {
  return (
    <>
    <h1 className='App'>App.js</h1>


    <Router>

    <nav>
      
      <Link to="/home" >Dashboard</Link> <br/><br/>
      <NavLink to="/contactus" >Contact</NavLink>
      
    </nav>
    <Routes>
   
    <Route exact path="/success" element={<Success/>} >
    </Route>

    <Route exact path="/" element={<Home/>} >
    </Route>
    <Route  path="/home" element={<Home/>} >
    </Route>

    <Route  path="/contactus/:id" element={<Contactus/>}>
    </Route>

    </Routes>
    </Router>




    </>
  );
}

export default App;
