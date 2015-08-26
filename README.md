# playground [![Build Status](https://travis-ci.org/gedim21/playground.svg)](https://travis-ci.org/gedim21/playground)

Playground is a sample JavaEE application that is intended to be used for rapid prototyping and testing out new ideas or new JavaEE features.
It uses:
* JSF 2.2
* EJB 3.2
* JPA 2.1
* Hibernate 5.0
* Ehcache 2.10

Playground is build with Maven and can be deployed on embedding Glassfish for convenience.

## How to run
Execute `mvn package embedded-glassfish:run` and then point your browser to `localhost:8888`.

>The default port number 8888 can be changed in the pom.xml file.