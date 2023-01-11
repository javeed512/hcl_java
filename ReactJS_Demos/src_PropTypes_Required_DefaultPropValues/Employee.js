

import React from 'react'

import PropTypes from 'prop-types';

function Employee(props) {
  return (
    <div>
      <h1>Eid: {props.eid}</h1>
    </div>
  )
}

Employee.propTypes = {

        eid: PropTypes.number.isRequired


}


export default Employee
