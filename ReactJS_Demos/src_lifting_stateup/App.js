
import './App.css';
import Child1 from './Child1';


import React, { Component } from 'react'

export default class App extends Component {

    state = {

      name:"javeed"
    }

  render() {
    return (
      <div>
            <h1>Parent State: {this.state.name}</h1>

            <Child1  name={this.state.name}></Child1>

      </div>
    )
  }
}
