## Module 1 : 

*Requirements*

  - Functional
  - Non Functional

  - Epics
  - User Stories
  - Acceptance Criteria
  - 4+1 View
   
*Documentaiton*

  - RAML
  - Studio
  - Exchange
  - Portal

*Architecture Digrams*

  - UML
    - Sequence Digram
    - State Digrams
  - Archimate
  - FMC
  - C4Model

*Customer Success*

  - Catalyst
  - C4E
  - Playbooks

## Module 2

Anypoint Platform

  - Business Group
  - Identity Management
    - Role Based Access Control
  - Client Management
  - Federated Identity Management
  - Audit Logs
  -	Semantic Versioning
  -	API deprecations

## Module 3
  
-	Connectors
-	Dataweave Transformations
-	Flow Controls ( Routing and Scopes )
-	Error handlers
- Transactions ( on error continue  - partial commit, on error propagate rollback)
-	Class loading isolation ( mule 3 vs mule 4 )

## Module 4

-	Non-blocking 
-	Concurrent
-	Synchronous
-	Asynchronous
-	Parallel Processing
-	Iterative Processing
-	Real-time 
-	Scheduled

-	Reactive Systems
-	Reactive Programming
-	Types of Thread Pools
	  UBER (4.3)
	  CPU_LITE (4.0 – 4.2)
    CPU_INTENSIVE
    IO_BLOCKING
    GRIZZLY_SHARED
    GRIZZLY_DEDICATED
-	Streaming three types
    Repeatable stream
      File based buffered
      in Memory
  Non Repeatable Stream

## Module #5

-	Complexity of point to point integration n2 
-	Reducing n2 complexity to O(n) using canonical data model
-	Validation
-	Message routing  ( Choice, Scatter gather, Asyc)
-	Transformer pattern
-	Enrichment pattern

## Module 6

- Munit testing
- White Box, Black Box ( Postman, Soap UI, JMeter )
- BAT functional testing – CI/CD pipeline for automated functional tests ( dataweave )
- Functional Monitoring Scripts in BAT CLI
- Jmeter Performance Testing 
- Security / Penetration Testing

## Module 7
- 6 ways to deploy your application
	Cloudhub
	Cloudhub vpc
o	Runtime fabric
	Pivotal cloud foundary edition
	Pirvate cloud edition
	Hybrid ( Stand alone, server, cluster)
- Cluster
	Hazlecast, performant and reliable configurations
	Asyc with VM Ques to distribute flows in multiple nodes / workers
	Mule Domain Projects

## Module 8

	In flows using variables
	Object Store ( transient, persistent, private object store )
	Backed with service Objectstore v2. service
	VM Ques
	Transient and persistent
	JMS
	Watermarks
	Connectors with object store

## Module 9

-	Logging for audits / Audit logging query API
-	Application Logs
		INFO, WARN, ERROR, DEBUG, TRACE levels
-	System Logs and Application Logs, how to get it
-	Custom log appenders
-	Monitoring, Custom Dash boards
-	JVM Monitoring -> JMX
-	API Analytics
-	Visualizer
-	Alerts
-	Business Insights, Business Events and Notifications using cloudhub connector.


## Module 10

Three ways of Automating Deployments
-	Mule Maven Plugin
-	Munit Maven Plugin
-	BAT CLI (functional testing scripts in dataweave)
-	CLI
-	Anypoint Platform API


## Module 11

-	Transactions for Reliability
-	Local Transactions
-	XA Transactions
-	Transaction manager Bitronix
-	SAGA Pattern
o	Choreographed
o	Orchestrated

## Module 12

●	Reliability in Mule applications can be achieved using
●	all about avoiding message loss
–	Until Successful scope
–	Reconnection strategies
–	Redelivery policy
–	NS:RETRY_EXHAUSTED exception scope
–	Transactions ( Covered in Module 11)
–	Reliability pattern using JMS

## Module 13

-	Using multiple cloud workers
-	Using multiple nodes and load balancing
-	Using Clustering


## Module 14
-	Looking at JVM heaps and garbage collection
-	Application Logs
-	System Log
-	Performance Vs Cost Vs Reliability
-	Performance monitoring using VisualVM
-	Vertical Scaling, Horizontal Scaling
-	Load balancing using third party load balancers
-	Clustering
-	AutoScaling
-	Synchronous asynchronous

## Module 15

-	Encryption
-	Hidden keys
-	TLS
-	Third Party Identity providers, SAML open ID 
-	Business Groups
-	Client management , ping federate
-	API Manager Policy Injection
-	Edge
-	Crypto, keystore

## Module 16

-	TLS & Certificates
-	VPC
-	VPN
-	Crypto Modules & DW Crypto
