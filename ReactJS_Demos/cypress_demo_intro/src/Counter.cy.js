import React from 'react'
import Counter from './Counter'

describe('<Counter />', () => {


    beforeEach("beforeEach",()=>{


        console.log("before test executed...")

    })


    afterEach("afterEach",()=>{


       console.log("after test success")

    }) 


  it('renders', () => {
    // see: https://on.cypress.io/mounting-react
    cy.mount(<Counter />)
     
    cy.get("h1[id='hid']").should('have.text','Hello Friends');

    let  element =  cy.get("h1[id='hid']");

      console.log("Counter component h1 text verified / tested")


  })

  it('click plus test',()=>{

      cy.mount(<Counter />)

      cy.contains('Plus').click();


        cy.get('h1').should('contain','Hello Friends')

  })



})