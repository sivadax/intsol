## Okta as Client ID Provider

1. create an okta account
2. login to developer.okta.com
3. API->Authorisation server->Add Authorisation Server
3. Go to meta url link
4. Copy the links and paste it in corresponding fields in anypoint platform identitymanagement 
4. In okta -> Appliations -> Add Appliation -> Web 
    give a Name 
    enable client credential checkbox and done
    copy the client id and client secret you get from the page u get after clicking done.
    paste these client id and secret in anypoint userid and client id
5. Create a token in Okta got to API->Token->Create token
   (visible only once, copy and save somewhere)
6. Authorisation header in anypoint platform add SSW 004GLhYi4JPG9Bv8MV26HSu3GxrPzfm7mqnkY7VwBJ
7. Save ( This will enable identitymanagement with okta)
8. Anypoint Platform -> Access Management -> Env -> Assign Identitymanager

--- Id manager is ready to be used in api Policy

9. apply policy to API API Manager -> API -> client id policy , jwt policy
10. request access for API frome change, generate clent id, secret, 
11. post https://njclabs.auth0.com/oauth/token in postman and below as body

{
  "client_id":"CLewN0b49dS8jbaOAEAtzrW5MBuIQMER",
  "client_secret":"pztqNjW9THabKFJYhDl_g9SPCdIcnRx3HGQnwVXtaHQT5jLb95gytuKsfdD1RXmV",
  "audience":"https://njclabs.auth0.com/api/v2/",
  "grant_type":"client_credentials"

}

you a get a token as response

12. get http://acme-aggregator-quote-creation-eapi.us-e2.cloudhub.io/api/test/quotes
    Authorisation bearer token : add the copied token from previous request
