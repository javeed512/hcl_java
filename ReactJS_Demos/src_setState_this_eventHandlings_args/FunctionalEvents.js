

function  FunctionalEvents(){

        function validate(){

                alert("validate func is called..");

        }


        function handleClick(e)
        {
            //e.preventDefault();
            console.log('clicked');
        }


   
    return(
        <>
        
        <h1>FunctionalEvents</h1>
        <button type="button"  onClick={validate}>Click</button> <br/>
        
        <a href="http://www.google.com" onClick={handleClick}>clickme</a> <br/>

        
        </>
    );




}

export default FunctionalEvents;