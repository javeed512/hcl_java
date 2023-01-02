
async function showAvatar() {

    // read our JSON
    let response = await fetch('https://jsonplaceholder.typicode.com/users');
    let user = await response.json();

    console.log(user)

}

showAvatar();