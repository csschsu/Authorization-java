# OrganizationCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isHeadOffice** | **Boolean** | If value is true, the organization is the head office |  [optional]
**isLegalEntity** | **Boolean** | If value is true, the organization is a legal entity known by a national referential. |  [optional]
**name** | **String** | Organization name (department name for example) |  [optional]
**nameType** | **String** | Type of the name : Co, Inc, Ltd,… |  [optional]
**organizationType** | **String** | Type of Organization (company, department...) |  [optional]
**tradingName** | **String** | Name that the organization (unit) trades under | 
**contactMedium** | [**List&lt;ContactMedium&gt;**](ContactMedium.md) |  |  [optional]
**creditRating** | [**List&lt;PartyCreditProfile&gt;**](PartyCreditProfile.md) |  |  [optional]
**existsDuring** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**externalReference** | [**List&lt;ExternalReference&gt;**](ExternalReference.md) |  |  [optional]
**organizationChildRelationship** | [**List&lt;OrganizationChildRelationship&gt;**](OrganizationChildRelationship.md) |  |  [optional]
**organizationIdentification** | [**List&lt;OrganizationIdentification&gt;**](OrganizationIdentification.md) |  |  [optional]
**organizationParentRelationship** | [**OrganizationParentRelationship**](OrganizationParentRelationship.md) |  |  [optional]
**otherName** | [**List&lt;OtherNameOrganization&gt;**](OtherNameOrganization.md) |  |  [optional]
**partyCharacteristic** | [**List&lt;Characteristic&gt;**](Characteristic.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**status** | [**OrganizationStateType**](OrganizationStateType.md) |  |  [optional]
**taxExemptionCertificate** | [**List&lt;TaxExemptionCertificate&gt;**](TaxExemptionCertificate.md) |  |  [optional]
**_atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**_atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**_atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
