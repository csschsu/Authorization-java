# OrganizationStateChangeEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The identifier of the notification. |  [optional]
**eventTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the event occurrence. |  [optional]
**description** | **String** | An explnatory of the event. |  [optional]
**timeOcurred** | [**OffsetDateTime**](OffsetDateTime.md) | The time the event occured. |  [optional]
**title** | **String** | The title of the event. |  [optional]
**eventType** | **String** | The type of the notification. |  [optional]
**domain** | **String** | The domain of the event. |  [optional]
**priority** | **String** | A priority. |  [optional]
**href** | **String** | Reference of the ProcessFlow |  [optional]
**id** | **String** | Identifier of the Process flow |  [optional]
**correlationId** | **String** | The correlation id for this event. |  [optional]
**event** | [**OrganizationStateChangeEventPayload**](OrganizationStateChangeEventPayload.md) |  |  [optional]
