# NotificationListenersClientSideApi

All URIs are relative to *https://serverRoot/tmf-api/party/v4/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listenToIndividualAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToIndividualAttributeValueChangeEvent) | **POST** /listener/individualAttributeValueChangeEvent | Client listener for entity IndividualAttributeValueChangeEvent
[**listenToIndividualCreateEvent**](NotificationListenersClientSideApi.md#listenToIndividualCreateEvent) | **POST** /listener/individualCreateEvent | Client listener for entity IndividualCreateEvent
[**listenToIndividualDeleteEvent**](NotificationListenersClientSideApi.md#listenToIndividualDeleteEvent) | **POST** /listener/individualDeleteEvent | Client listener for entity IndividualDeleteEvent
[**listenToIndividualStateChangeEvent**](NotificationListenersClientSideApi.md#listenToIndividualStateChangeEvent) | **POST** /listener/individualStateChangeEvent | Client listener for entity IndividualStateChangeEvent
[**listenToOrganizationAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToOrganizationAttributeValueChangeEvent) | **POST** /listener/organizationAttributeValueChangeEvent | Client listener for entity OrganizationAttributeValueChangeEvent
[**listenToOrganizationCreateEvent**](NotificationListenersClientSideApi.md#listenToOrganizationCreateEvent) | **POST** /listener/organizationCreateEvent | Client listener for entity OrganizationCreateEvent
[**listenToOrganizationDeleteEvent**](NotificationListenersClientSideApi.md#listenToOrganizationDeleteEvent) | **POST** /listener/organizationDeleteEvent | Client listener for entity OrganizationDeleteEvent
[**listenToOrganizationStateChangeEvent**](NotificationListenersClientSideApi.md#listenToOrganizationStateChangeEvent) | **POST** /listener/organizationStateChangeEvent | Client listener for entity OrganizationStateChangeEvent

<a name="listenToIndividualAttributeValueChangeEvent"></a>
# **listenToIndividualAttributeValueChangeEvent**
> EventSubscription listenToIndividualAttributeValueChangeEvent(body)

Client listener for entity IndividualAttributeValueChangeEvent

Example of a client listener for receiving the notification IndividualAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
IndividualAttributeValueChangeEvent body = new IndividualAttributeValueChangeEvent(); // IndividualAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToIndividualAttributeValueChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToIndividualAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualAttributeValueChangeEvent**](IndividualAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToIndividualCreateEvent"></a>
# **listenToIndividualCreateEvent**
> EventSubscription listenToIndividualCreateEvent(body)

Client listener for entity IndividualCreateEvent

Example of a client listener for receiving the notification IndividualCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
IndividualCreateEvent body = new IndividualCreateEvent(); // IndividualCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToIndividualCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToIndividualCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualCreateEvent**](IndividualCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToIndividualDeleteEvent"></a>
# **listenToIndividualDeleteEvent**
> EventSubscription listenToIndividualDeleteEvent(body)

Client listener for entity IndividualDeleteEvent

Example of a client listener for receiving the notification IndividualDeleteEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
IndividualDeleteEvent body = new IndividualDeleteEvent(); // IndividualDeleteEvent | The event data
try {
    EventSubscription result = apiInstance.listenToIndividualDeleteEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToIndividualDeleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualDeleteEvent**](IndividualDeleteEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToIndividualStateChangeEvent"></a>
# **listenToIndividualStateChangeEvent**
> EventSubscription listenToIndividualStateChangeEvent(body)

Client listener for entity IndividualStateChangeEvent

Example of a client listener for receiving the notification IndividualStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
IndividualStateChangeEvent body = new IndividualStateChangeEvent(); // IndividualStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToIndividualStateChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToIndividualStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualStateChangeEvent**](IndividualStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToOrganizationAttributeValueChangeEvent"></a>
# **listenToOrganizationAttributeValueChangeEvent**
> EventSubscription listenToOrganizationAttributeValueChangeEvent(body)

Client listener for entity OrganizationAttributeValueChangeEvent

Example of a client listener for receiving the notification OrganizationAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
OrganizationAttributeValueChangeEvent body = new OrganizationAttributeValueChangeEvent(); // OrganizationAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToOrganizationAttributeValueChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToOrganizationAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationAttributeValueChangeEvent**](OrganizationAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToOrganizationCreateEvent"></a>
# **listenToOrganizationCreateEvent**
> EventSubscription listenToOrganizationCreateEvent(body)

Client listener for entity OrganizationCreateEvent

Example of a client listener for receiving the notification OrganizationCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
OrganizationCreateEvent body = new OrganizationCreateEvent(); // OrganizationCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToOrganizationCreateEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToOrganizationCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationCreateEvent**](OrganizationCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToOrganizationDeleteEvent"></a>
# **listenToOrganizationDeleteEvent**
> EventSubscription listenToOrganizationDeleteEvent(body)

Client listener for entity OrganizationDeleteEvent

Example of a client listener for receiving the notification OrganizationDeleteEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
OrganizationDeleteEvent body = new OrganizationDeleteEvent(); // OrganizationDeleteEvent | The event data
try {
    EventSubscription result = apiInstance.listenToOrganizationDeleteEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToOrganizationDeleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationDeleteEvent**](OrganizationDeleteEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToOrganizationStateChangeEvent"></a>
# **listenToOrganizationStateChangeEvent**
> EventSubscription listenToOrganizationStateChangeEvent(body)

Client listener for entity OrganizationStateChangeEvent

Example of a client listener for receiving the notification OrganizationStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
OrganizationStateChangeEvent body = new OrganizationStateChangeEvent(); // OrganizationStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToOrganizationStateChangeEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToOrganizationStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationStateChangeEvent**](OrganizationStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

