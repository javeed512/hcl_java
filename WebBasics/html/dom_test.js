

function  test(){


    let elements =    document.getElementsByTagName("div");

    console.log(elements);

    console.log(elements[0].innerText)


}

function  changeData(){

  let divElement =  document.getElementById("id1");

    console.log(divElement)

        divElement.innerText = "Hi I am Javeed";


}


function rename(){

    let bid =  document.getElementById("bid");

        console.log(bid)
        console.log(bid.value)

        bid.value = "cancel";


     let tagList =   document.getElementsByClassName("cls1");

        console.log(tagList[0]);

                let btn = tagList[0];

                btn.click();

                

            


}