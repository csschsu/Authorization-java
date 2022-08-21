# OrganizationApi

All URIs are relative to *https://serverRoot/tmf-api/party/v4/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /organization | Creates a Organization
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /organization/{id} | Deletes a Organization
[**listOrganization**](OrganizationApi.md#listOrganization) | **GET** /organization | List or find Organization objects
[**patchOrganization**](OrganizationApi.md#patchOrganization) | **PATCH** /organization/{id} | Updates partially a Organization
[**retrieveOrganization**](OrganizationApi.md#retrieveOrganization) | **GET** /organization/{id} | Retrieves a Organization by ID

<a name="createOrganization"></a>
# **createOrganization**
> Organization createOrganization(body)

Creates a Organization

This operation creates a Organization entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
OrganizationCreate body = new OrganizationCreate(); // OrganizationCreate | The Organization to be created
try {
    Organization result = apiInstance.createOrganization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#createOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationCreate**](OrganizationCreate.md)| The Organization to be created |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(id)

Deletes a Organization

This operation deletes a Organization entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String id = "id_example"; // String | Identifier of the Organization
try {
    apiInstance.deleteOrganization(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the Organization |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="listOrganization"></a>
# **listOrganization**
> List&lt;Organization&gt; listOrganization(fields, offset, limit)

List or find Organization objects

This operation list or find Organization entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<Organization> result = apiInstance.listOrganization(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#listOrganization");
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

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchOrganization"></a>
# **patchOrganization**
> Organization patchOrganization(body, id)

Updates partially a Organization

This operation updates partially a Organization entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
OrganizationUpdate body = new OrganizationUpdate(); // OrganizationUpdate | The Organization to be updated
String id = "id_example"; // String | Identifier of the Organization
try {
    Organization result = apiInstance.patchOrganization(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationUpdate**](OrganizationUpdate.md)| The Organization to be updated |
 **id** | **String**| Identifier of the Organization |

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveOrganization"></a>
# **retrieveOrganization**
> Organization retrieveOrganization(id, fields)

Retrieves a Organization by ID

This operation retrieves a Organization entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String id = "id_example"; // String | Identifier of the Organization
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    Organization result = apiInstance.retrieveOrganization(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#retrieveOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the Organization |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

