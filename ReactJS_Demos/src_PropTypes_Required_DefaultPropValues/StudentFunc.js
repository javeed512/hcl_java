



import PropTypes from 'prop-types';




import React, { Component } from 'react'

export default class StudentFunc extends Component {
  render() {
    return (
      <div>

        <h1>RollNo : {this.props.rollno}</h1>
        <h1>Name: {this.props.name}</h1>
      
        
      </div>
    )
  }
}


StudentFunc.propTypes ={
    name: PropTypes.string.isRequired,
    rollno: PropTypes.number,
    isActive: PropTypes.bool
}

StudentFunc.defaultProps = {

        name: "Javeed Sir",
        rollno: 100

}

