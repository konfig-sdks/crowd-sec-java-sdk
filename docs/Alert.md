

# Alert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | only relevant for GET, ignored in POST requests |  [optional] [readonly] |
|**uuid** | **String** | only relevant for LAPI-&gt;CAPI, ignored for cscli-&gt;LAPI and crowdsec-&gt;LAPI |  [optional] [readonly] |
|**machineId** | **String** | only relevant for LAPI-&gt;CAPI, ignored for cscli-&gt;LAPI and crowdsec-&gt;LAPI |  [optional] [readonly] |
|**createdAt** | **String** | only relevant for GET, ignored in POST requests |  [optional] [readonly] |
|**scenario** | **String** |  |  |
|**scenarioHash** | **String** |  |  |
|**scenarioVersion** | **String** |  |  |
|**message** | **String** | a human readable message |  |
|**eventsCount** | **Integer** |  |  |
|**startAt** | **String** |  |  |
|**stopAt** | **String** |  |  |
|**capacity** | **Integer** |  |  |
|**leakspeed** | **String** |  |  |
|**simulated** | **Boolean** |  |  |
|**events** | [**List&lt;Event&gt;**](Event.md) | the Meta of the events leading to overflow |  |
|**remediation** | **Boolean** |  |  [optional] |
|**decisions** | [**List&lt;Decision&gt;**](Decision.md) |  |  [optional] |
|**source** | [**Source**](Source.md) |  |  |
|**meta** | [**List&lt;MetaInner&gt;**](MetaInner.md) | the Meta data of the Alert itself |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |



