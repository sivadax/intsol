## Apache ab
run apache ab , concurrent request, benchmark API
```
ab -n 1000000 -c 10 http://localhost:8081/happy
```

## Jmeter
jmeter html report
```
jmeter -n -t happy.jmx -l happy.log -e -o happy
```

## okta

step 1
```
POST https://dev-xxxxxx.okta.com/oauth2/default/v1/token?scope=mulescope&grant_type=client_credentials
```
Postman Basic Auth . provide username and password -> clientid and client secret obtained from anypoint platform frome exchange
Header application/x-www-form-urlencoded

step 2
```
http://test-openid-njclabs-flights.us-e2.cloudhub.io/flights
```
Authorization Bearer Token : " put the token obtained in step 1"


Custom Connectors

```
mvn org.mule.extensions:mule-extensions-archetype-maven-plugin:1.2.0:generate
```

