

async function f() {

    let promise = new Promise((resolve, reject) => {
      setTimeout(() => resolve("done!"), 3000)
    });
  
    let result = await promise; // wait until the promise resolves (*)
  
    alert(result); // "done!"
  }
  
  f();

