

import React from 'react'

function Student({text,count,salary}) {
    console.log("Rendering :",text +" "+count);
    return (
        <div>{text} - {count} - {salary}</div>
    )
}

export default React.memo(Student);
