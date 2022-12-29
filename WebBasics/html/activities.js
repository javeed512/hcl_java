let activities = [
    {
    "id":1,
    "subject":"math",
    "activity":"read tables from 2 to 10"
    },
    {
    "id":2,
    "subject":"science",
    "activity":"read about human brain"
    },
    {
    "id":3,
    "subject":"social",
    "activity":"read about politics"
    }
    
    ]


function  getActivity(){


            console.log(activities)

            console.log(activities[0])

            console.log(activities[0].subject)


        document.getElementById("hid").innerText = JSON.stringify(activities[0]);




}


    
    
    
    
    
    
    
    
    
    
    