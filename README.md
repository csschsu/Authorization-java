# swagger-java-client

API Party
- API version: 4.0.0
  - Build date: 2022-08-20T21:27:45.774766+02:00[Europe/Stockholm]

## TMF API Reference : TMF 632 - Party   ### Release : 19.0   The party API provides standardized mechanism for party management such as creation, update, retrieval, deletion and notification of events. Party can be an individual or an organization that has any kind of relation with the enterprise. Party is created to record individual or organization information before the assignment of any role. For example, within the context of a split billing mechanism, Party API allows creation of the individual or organization that will play the role of 3 rd payer for a given offer and, then, allows consultation or update of his information.  ### Resources - Organization - Individual - Hub  Party API performs the following operations : - Retrieve an organization or an individual - Retrieve a collection of organizations or individuals according to given criteria - Create a new organization or a new individual - Update an existing organization or an existing individual - Delete an existing organization or an existing individual - Notify events on organizatin or individual


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EventsSubscriptionApi;

import java.io.File;
import java.util.*;

public class EventsSubscriptionApiExample {

    public static void main(String[] args) {
        
        EventsSubscriptionApi apiInstance = new EventsSubscriptionApi();
        EventSubscriptionInput body = new EventSubscriptionInput(); // EventSubscriptionInput | Data containing the callback endpoint to deliver the information
        try {
            EventSubscription result = apiInstance.registerListener(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsSubscriptionApi#registerListener");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EventsSubscriptionApi;

import java.io.File;
import java.util.*;

public class EventsSubscriptionApiExample {

    public static void main(String[] args) {
        
        EventsSubscriptionApi apiInstance = new EventsSubscriptionApi();
        String id = "id_example"; // String | The id of the registered listener
        try {
            apiInstance.unregisterListener(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsSubscriptionApi#unregisterListener");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://serverRoot/tmf-api/party/v4/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsSubscriptionApi* | [**registerListener**](docs/EventsSubscriptionApi.md#registerListener) | **POST** /hub | Register a listener
*EventsSubscriptionApi* | [**unregisterListener**](docs/EventsSubscriptionApi.md#unregisterListener) | **DELETE** /hub/{id} | Unregister a listener
*IndividualApi* | [**createIndividual**](docs/IndividualApi.md#createIndividual) | **POST** /individual | Creates a Individual
*IndividualApi* | [**deleteIndividual**](docs/IndividualApi.md#deleteIndividual) | **DELETE** /individual/{id} | Deletes a Individual
*IndividualApi* | [**listIndividual**](docs/IndividualApi.md#listIndividual) | **GET** /individual | List or find Individual objects
*IndividualApi* | [**patchIndividual**](docs/IndividualApi.md#patchIndividual) | **PATCH** /individual/{id} | Updates partially a Individual
*IndividualApi* | [**retrieveIndividual**](docs/IndividualApi.md#retrieveIndividual) | **GET** /individual/{id} | Retrieves a Individual by ID
*NotificationListenersClientSideApi* | [**listenToIndividualAttributeValueChangeEvent**](docs/NotificationListenersClientSideApi.md#listenToIndividualAttributeValueChangeEvent) | **POST** /listener/individualAttributeValueChangeEvent | Client listener for entity IndividualAttributeValueChangeEvent
*NotificationListenersClientSideApi* | [**listenToIndividualCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToIndividualCreateEvent) | **POST** /listener/individualCreateEvent | Client listener for entity IndividualCreateEvent
*NotificationListenersClientSideApi* | [**listenToIndividualDeleteEvent**](docs/NotificationListenersClientSideApi.md#listenToIndividualDeleteEvent) | **POST** /listener/individualDeleteEvent | Client listener for entity IndividualDeleteEvent
*NotificationListenersClientSideApi* | [**listenToIndividualStateChangeEvent**](docs/NotificationListenersClientSideApi.md#listenToIndividualStateChangeEvent) | **POST** /listener/individualStateChangeEvent | Client listener for entity IndividualStateChangeEvent
*NotificationListenersClientSideApi* | [**listenToOrganizationAttributeValueChangeEvent**](docs/NotificationListenersClientSideApi.md#listenToOrganizationAttributeValueChangeEvent) | **POST** /listener/organizationAttributeValueChangeEvent | Client listener for entity OrganizationAttributeValueChangeEvent
*NotificationListenersClientSideApi* | [**listenToOrganizationCreateEvent**](docs/NotificationListenersClientSideApi.md#listenToOrganizationCreateEvent) | **POST** /listener/organizationCreateEvent | Client listener for entity OrganizationCreateEvent
*NotificationListenersClientSideApi* | [**listenToOrganizationDeleteEvent**](docs/NotificationListenersClientSideApi.md#listenToOrganizationDeleteEvent) | **POST** /listener/organizationDeleteEvent | Client listener for entity OrganizationDeleteEvent
*NotificationListenersClientSideApi* | [**listenToOrganizationStateChangeEvent**](docs/NotificationListenersClientSideApi.md#listenToOrganizationStateChangeEvent) | **POST** /listener/organizationStateChangeEvent | Client listener for entity OrganizationStateChangeEvent
*OrganizationApi* | [**createOrganization**](docs/OrganizationApi.md#createOrganization) | **POST** /organization | Creates a Organization
*OrganizationApi* | [**deleteOrganization**](docs/OrganizationApi.md#deleteOrganization) | **DELETE** /organization/{id} | Deletes a Organization
*OrganizationApi* | [**listOrganization**](docs/OrganizationApi.md#listOrganization) | **GET** /organization | List or find Organization objects
*OrganizationApi* | [**patchOrganization**](docs/OrganizationApi.md#patchOrganization) | **PATCH** /organization/{id} | Updates partially a Organization
*OrganizationApi* | [**retrieveOrganization**](docs/OrganizationApi.md#retrieveOrganization) | **GET** /organization/{id} | Retrieves a Organization by ID

## Documentation for Models

 - [Any](docs/Any.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentRef](docs/AttachmentRef.md)
 - [AttachmentRefOrValue](docs/AttachmentRefOrValue.md)
 - [Characteristic](docs/Characteristic.md)
 - [ContactMedium](docs/ContactMedium.md)
 - [Disability](docs/Disability.md)
 - [EntityRef](docs/EntityRef.md)
 - [Error](docs/Error.md)
 - [EventSubscription](docs/EventSubscription.md)
 - [EventSubscriptionInput](docs/EventSubscriptionInput.md)
 - [ExternalReference](docs/ExternalReference.md)
 - [Individual](docs/Individual.md)
 - [IndividualAttributeValueChangeEvent](docs/IndividualAttributeValueChangeEvent.md)
 - [IndividualAttributeValueChangeEventPayload](docs/IndividualAttributeValueChangeEventPayload.md)
 - [IndividualCreate](docs/IndividualCreate.md)
 - [IndividualCreateEvent](docs/IndividualCreateEvent.md)
 - [IndividualCreateEventPayload](docs/IndividualCreateEventPayload.md)
 - [IndividualDeleteEvent](docs/IndividualDeleteEvent.md)
 - [IndividualDeleteEventPayload](docs/IndividualDeleteEventPayload.md)
 - [IndividualIdentification](docs/IndividualIdentification.md)
 - [IndividualStateChangeEvent](docs/IndividualStateChangeEvent.md)
 - [IndividualStateChangeEventPayload](docs/IndividualStateChangeEventPayload.md)
 - [IndividualStateType](docs/IndividualStateType.md)
 - [IndividualUpdate](docs/IndividualUpdate.md)
 - [LanguageAbility](docs/LanguageAbility.md)
 - [MediumCharacteristic](docs/MediumCharacteristic.md)
 - [Organization](docs/Organization.md)
 - [OrganizationAttributeValueChangeEvent](docs/OrganizationAttributeValueChangeEvent.md)
 - [OrganizationAttributeValueChangeEventPayload](docs/OrganizationAttributeValueChangeEventPayload.md)
 - [OrganizationChildRelationship](docs/OrganizationChildRelationship.md)
 - [OrganizationCreate](docs/OrganizationCreate.md)
 - [OrganizationCreateEvent](docs/OrganizationCreateEvent.md)
 - [OrganizationCreateEventPayload](docs/OrganizationCreateEventPayload.md)
 - [OrganizationDeleteEvent](docs/OrganizationDeleteEvent.md)
 - [OrganizationDeleteEventPayload](docs/OrganizationDeleteEventPayload.md)
 - [OrganizationIdentification](docs/OrganizationIdentification.md)
 - [OrganizationParentRelationship](docs/OrganizationParentRelationship.md)
 - [OrganizationRef](docs/OrganizationRef.md)
 - [OrganizationStateChangeEvent](docs/OrganizationStateChangeEvent.md)
 - [OrganizationStateChangeEventPayload](docs/OrganizationStateChangeEventPayload.md)
 - [OrganizationStateType](docs/OrganizationStateType.md)
 - [OrganizationUpdate](docs/OrganizationUpdate.md)
 - [OtherNameIndividual](docs/OtherNameIndividual.md)
 - [OtherNameOrganization](docs/OtherNameOrganization.md)
 - [Party](docs/Party.md)
 - [PartyCreditProfile](docs/PartyCreditProfile.md)
 - [Quantity](docs/Quantity.md)
 - [RelatedParty](docs/RelatedParty.md)
 - [Skill](docs/Skill.md)
 - [TaxDefinition](docs/TaxDefinition.md)
 - [TaxExemptionCertificate](docs/TaxExemptionCertificate.md)
 - [TimePeriod](docs/TimePeriod.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


