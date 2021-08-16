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


## Custom Connectors

```
mvn org.mule.extensions:mule-extensions-archetype-maven-plugin:1.2.0:generate
```

## SSL Debugging Enable

```
-Djavax.net.debug=ssl
-Djavax.net.debug=ssl:handshake.

```

## Run two mule servers on same machine with two different nodes.
```
mule -M-Dhttp.port=8081
```

configure http.port in the application as placeholder.
```
${http.port}
```
## ServiceMesh Installation on Kubes

```
kubectl get svc
kubectl  get pods -n istio-system
asmctl adapter help
asmctl adapter sizes
asmctl adapter create --name=nto-payment-adapter --clientId=xxxxyyyzzzzz --clientSecret=ffxxsszzyy --size=small --namespace=nto-payment --replicas=1
configure template.yaml and add configuration details.
	- environmentId
	-assetId
	instanceLabel
	apiInstance
	apiSpec
secretkyRef
	name
	key

---
configure api binding
 

appy config
kubectl apply -f nto-payment-api-creation.yaml

```

## Anypoint Token in case of SAML
```
curl -X POST \
  https://anypoint.mulesoft.com/accounts/login/receive-id \
  -H 'Content-Type: application/json' \
  -H 'X-Requested-With: XMLHttpRequest' \
  -d '{
    "SAMLResponse": "<SAML_RESPONSE>"
}'
```
Anypoint CLI: A user can access a platform API by supplying the -bearer option to the anypoint-cli command. See Anypoint CLI for more information.

curl: A user can access a platform API by passing the bearer token when accessing an API endpoint as shown in the following:
```
curl -X GET \
  https://anypoint.mulesoft.com/accounts/api/me \
  -H 'Authorization: Bearer <BEARER_TOKEN>'
```

## Autodiscovery issue

add these in runtime manager properties

```
anypoint.platform.client_id=XXXXXXXX
anypoint.platform.client_secret=XXXXXXXX
```
