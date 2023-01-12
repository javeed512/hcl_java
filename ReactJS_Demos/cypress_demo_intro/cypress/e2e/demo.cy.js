describe('template spec', () => {

    before('before test',()=>{

      cy.visit('http://localhost:3000')


    })



  it('passes', () => {
    //cy.visit('http://localhost:3000')

    cy.get("#countId")

  

    cy.expect(10).to.equal(10);


  })


  it('test object',()=>{

    
      const employee = {

          eid:101,
          ename:"javeed",
          salary:50000

      }


       

        assert.isObject(employee,'it is object')

  });


  it("test web site contains Hello Friends",()=>{

   // cy.visit('http://localhost:3000')

    cy.contains('Hello Friends')
    cy.contains('Plus').click();

    cy.contains('Welcome to ReactJS')



  })



})