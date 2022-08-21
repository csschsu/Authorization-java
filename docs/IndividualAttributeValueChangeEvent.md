# IndividualAttributeValueChangeEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The identifier of the notification. |  [optional]
**fieldPath** | **String** | The path identifying the object field concerned by this notification. |  [optional]
**eventTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the event occurrence. |  [optional]
**description** | **String** | An explnatory of the event. |  [optional]
**timeOcurred** | [**OffsetDateTime**](OffsetDateTime.md) | The time the event occured. |  [optional]
**title** | **String** | The title of the event. |  [optional]
**eventType** | **String** | The type of the notification. |  [optional]
**domain** | **String** | The domain of the event. |  [optional]
**priority** | **String** | A priority. |  [optional]
**correlationId** | **String** | The correlation id for this event. |  [optional]
**event** | [**IndividualAttributeValueChangeEventPayload**](IndividualAttributeValueChangeEventPayload.md) |  |  [optional]
