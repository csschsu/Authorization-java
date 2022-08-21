# IndividualApi

All URIs are relative to *https://serverRoot/tmf-api/party/v4/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIndividual**](IndividualApi.md#createIndividual) | **POST** /individual | Creates a Individual
[**deleteIndividual**](IndividualApi.md#deleteIndividual) | **DELETE** /individual/{id} | Deletes a Individual
[**listIndividual**](IndividualApi.md#listIndividual) | **GET** /individual | List or find Individual objects
[**patchIndividual**](IndividualApi.md#patchIndividual) | **PATCH** /individual/{id} | Updates partially a Individual
[**retrieveIndividual**](IndividualApi.md#retrieveIndividual) | **GET** /individual/{id} | Retrieves a Individual by ID

<a name="createIndividual"></a>
# **createIndividual**
> Individual createIndividual(body)

Creates a Individual

This operation creates a Individual entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
IndividualCreate body = new IndividualCreate(); // IndividualCreate | The Individual to be created
try {
    Individual result = apiInstance.createIndividual(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#createIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualCreate**](IndividualCreate.md)| The Individual to be created |

### Return type

[**Individual**](Individual.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteIndividual"></a>
# **deleteIndividual**
> deleteIndividual(id)

Deletes a Individual

This operation deletes a Individual entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
String id = "id_example"; // String | Identifier of the Individual
try {
    apiInstance.deleteIndividual(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#deleteIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the Individual |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listIndividual"></a>
# **listIndividual**
> List&lt;Individual&gt; listIndividual(fields, offset, limit)

List or find Individual objects

This operation list or find Individual entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<Individual> result = apiInstance.listIndividual(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#listIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;Individual&gt;**](Individual.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchIndividual"></a>
# **patchIndividual**
> Individual patchIndividual(body, id)

Updates partially a Individual

This operation updates partially a Individual entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
IndividualUpdate body = new IndividualUpdate(); // IndividualUpdate | The Individual to be updated
String id = "id_example"; // String | Identifier of the Individual
try {
    Individual result = apiInstance.patchIndividual(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#patchIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IndividualUpdate**](IndividualUpdate.md)| The Individual to be updated |
 **id** | **String**| Identifier of the Individual |

### Return type

[**Individual**](Individual.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveIndividual"></a>
# **retrieveIndividual**
> Individual retrieveIndividual(id, fields)

Retrieves a Individual by ID

This operation retrieves a Individual entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndividualApi;


IndividualApi apiInstance = new IndividualApi();
String id = "id_example"; // String | Identifier of the Individual
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    Individual result = apiInstance.retrieveIndividual(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndividualApi#retrieveIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the Individual |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**Individual**](Individual.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

