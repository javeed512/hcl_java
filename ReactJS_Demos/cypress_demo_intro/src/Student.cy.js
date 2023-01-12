import React from 'react'
import Student from './Student'

describe('<Student />', () => {
  it('renders', () => {
    // see: https://on.cypress.io/mounting-react
    cy.mount(<Student />)

     // cy.get("h1[id='id1']").should('have.text',"Welcome")

      cy.contains("Welcome").should('be.visible').and('have.text','Welcome');
    

     
  })

  it('test student component hello text',()=>{

      cy.mount(<Student />) // render

    //cy.contains("Button1").click();



  })

  it("Test Input Fields",()=>{


      cy.mount(<Student/>);

     cy.get("input[name=username]").focus().type("javeed")

     cy.get("input[name=password]").type("tiger")

     cy.get("button[name=login]").click();
  })


})