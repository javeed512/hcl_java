
import './App.css';
import Employee from './Employee';
import StudentFunc from './StudentFunc';

function App() {

    
    const  user = "Employee";
   
      if(user === "Student"){

          return(
          <> <h1>Student</h1>
            <StudentFunc   rollno={101} name="tom"  isActive={true} ></StudentFunc>
          </>
          );
      }
      


  return (
    <>
    <h1 className='App'>Welcome to ReactJS</h1>


    <Employee   eid={600}></Employee>
    </>
  );
}

export default App;
