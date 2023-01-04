
function  Student(props){

    function add(a,b){

            return a+b;

    }



    return(
        <>
        <h1>Hi , I am  {props.sname} and a student !  {add(4,4)} </h1>
        <h2>Sid: {props.sid}  SName: {props.sname}    Fee: {props.fee}</h2>

        </>
        );


}

export default Student;