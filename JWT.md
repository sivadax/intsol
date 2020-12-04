# JSON Web Token


## What is JSON Web Token? 

JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.

## JWT Use Cases ? 

### Authorization : 

Once the user is logged in, each subsequent request will include the JWT, allowing the user to access routes, services, and resources that are permitted with that token. Single Sign On is a feature that widely uses JWT nowadays,

### Information Exchange: 

JSON Web Tokens are a good way of securely transmitting information between parties. Because JWTs can be signed—for example, using public/private key pairs

## What is the JSON Web Token structure?

- Header
- Payload
- Signature

Therefore, a JWT typically looks like the following.

`xxxxx.yyyyy.zzzzz`

### Header
The header typically consists of two parts: the type of the token, which is JWT, and the signing algorithm being used, such as HMAC SHA256 or RSA.

For example Then, this JSON is Base64Url encoded to form the first part of the JWT.

`
{
  "alg": "HS256",
  "typ": "JWT"
}
`

### Payload

The second part of the token is the payload, which contains the claims. Claims are statements about an entity (typically, the user) and additional data. There are three types of claims: 
- registered
- public
- private claims.

#### Registered claims:
These are a set of predefined claims which are not mandatory but recommended

#### Public claims:
These can be defined at will by those using JWTs.

#### Private claims: 
These are the custom claims created to share information between parties that agree on using them and are neither registered or public claims.

### Signature 
To create the signature part you have to take the encoded header, the encoded payload, a secret, the algorithm specified in the header, and sign that.


![alt text](https://cdn2.auth0.com/docs/media/articles/api-auth/client-credentials-grant.png "Logo Title Text 1")

