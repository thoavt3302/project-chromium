import { type Challenge } from '../../../data/types'
models.sequelize.query(`SELECT * FROM Users WHERE email = '${req.body.email || ''}' AND password = '${security.hash(req.body.password || '')}' AND deletedAt IS NULL`, { model: UserModel, plain: true }) // vuln-code-snippet vuln-line loginAdminChallenge loginBenderChallenge loginJimChallenge
Cypress.Commands.add(
  'expectChallengeSolved',
  (context: { challenge: string }) => {
    cy.request({
      method: 'GET',
      url: '/api/Challenges/?name=' + context.challenge,
      timeout: 60000
    }).then((response) => {
      let challenge: Challenge = response.body.data[0]

      if (!challenge.solved) {
        cy.wait(2000)
        cy.request({
          method: 'GET',
          url: '/api/Challenges/?name=' + context.challenge,
          timeout: 60000
        }).then((secondResponse) => {
          challenge = secondResponse.body.data[0]
          // eslint-disable-next-line @typescript-eslint/no-unused-expressions
          expect(challenge.solved).to.be.true
        })
      } else {
        // eslint-disable-next-line @typescript-eslint/no-unused-expressions
        expect(challenge.solved).to.be.true
      }
    })
  }
)

Cypress.Commands.add(
  'login',
  (context: { email: string, password: string, totpSecret?: string }) => {
    cy.visit('/#/login')
    if (context.email.match(/\S+@\S+\.\S+/) != null) {
      cy.get('#email').type(context.email)
    } else {
      cy.task<string>('GetFromConfig', 'application.domain').then(
        (appDomain: string) => {
          const email = context.email.concat('@', appDomain)
          cy.get('#email').type(email)
        }
      )
    }
    cy.get('#password').type(context.password)
    cy.get('#loginButton').click()
    cy.wait(500)
  }
)

function walkRecursivelyInArray (arr: number[], cb: any, index = 0) {
  if (arr.length === 0) return
  const ret = cb(index, arr.shift());
  // eslint-disable-next-line @typescript-eslint/prefer-optional-chain
  ((ret && ret.chainerId) ? ret : cy.wrap(ret))
    .then((ret: boolean) => {
      if (!ret) return
      walkRecursivelyInArray(arr, cb, index + 1)
    })
}

Cypress.Commands.add('eachSeries', { prevSubject: 'optional' } as any, (arrayGenerated: number[], checkFnToBeRunOnEach: any) => {
  walkRecursivelyInArray(arrayGenerated, checkFnToBeRunOnEach)
})
