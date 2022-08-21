# IndividualIdentification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identificationId** | **String** | Identifier |  [optional]
**identificationType** | **String** | Identification type (passport, national identity card, drivers license, social security number, birth certificate) |  [optional]
**issuingAuthority** | **String** | Authority which has issued the identifier, such as: social security, town hall |  [optional]
**issuingDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which the identifier was issued |  [optional]
**attachment** | [**AttachmentRefOrValue**](AttachmentRefOrValue.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
