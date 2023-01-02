
function  test(){

var promise = new Promise(function(resolve, reject) { 
    const x = "javeed"; 
    const y = "java"

    if(x === y) { 
        
        resolve(); 
    } else { 
      reject(); 
    } 
  }); 

  
      
  promise. 
      then(function () {  // resolve(){....}
          console.log('Success, You are a Javeed Trainer'); 
      }). 
      catch(function () {   // reject(){ .. .}
          console.log('Some error has occurred'); 
      }).
      finally(()=>{

        console.log("finally executed..")
      }


      );


      console.log(promise)
      

    }

    test();