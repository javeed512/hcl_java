

import React from 'react'
import {Navigate} from 'react-router-dom'

function Home() {
  return (
    <div>
      
      <h1>Welcome to Home Paga</h1>

      <Navigate to="/success"></Navigate>

    </div>
  );
}

export default Home;
