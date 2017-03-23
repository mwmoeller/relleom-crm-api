# relleom-crm-api
This is a REST API that exposes a simplified model of a CRM.  This implements th Hypermedia As The Engine Of Application State (HATEOAS) constraint out of the box using the Spring Framework, Spring Boot, MongoDB and auth0.

# Getting started
 * If you haven't already done so, [sign up](https://auth0.com/signup) for you free Auth0 account.
 * Create a new application in the dashboard and find the client ID, client secret, and domain for your app. These keys need to be used in the samples.
 * Edit /src/main/resources/application.properties and use the values above to set auth0.audience, auth0.issuer, and auth0.clientsecret
 * install a MongoDB instance locally
 * install the JDK and install Gradle
 * Run gradle build.gradle