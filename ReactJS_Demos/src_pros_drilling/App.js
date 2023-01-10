
import './App.css';
import ComponentA from './ComponentA';

function App(props) {
  return (
    <>
    <h1 className='App'>Welcome to ReactJS {props.name}</h1>
    <ComponentA  name={props.name} />

    </>
  );
}

export default App;
