
import './App.css';

import styled  from 'styled-components'
import Customer from './Customer';

function App() {

    const Div = styled.div `  margin: 20px;  
    border: 5px dashed green;  
    &:hover {  
    background-color: ${(props) => props.hoverColor};  
    } `  ;


  return (
    <>
    <h1 className='App'>Welcome to ReactJS</h1>
   
    <Div hoverColor="Orange">

    <p>Hello friends</p>

    </Div>

  
    <Customer></Customer>

    </>

  );
}

export default App;
