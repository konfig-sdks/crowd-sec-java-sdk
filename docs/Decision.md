

# Decision


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | (only relevant for GET ops) the unique id |  [optional] [readonly] |
|**uuid** | **String** | only relevant for LAPI-&gt;CAPI, ignored for cscli-&gt;LAPI and crowdsec-&gt;LAPI |  [optional] [readonly] |
|**origin** | **String** | the origin of the decision : cscli, crowdsec |  |
|**type** | **String** | the type of decision, might be &#39;ban&#39;, &#39;captcha&#39; or something custom. Ignored when watcher (cscli/crowdsec) is pushing to APIL. |  |
|**scope** | **String** | the scope of decision : does it apply to an IP, a range, a username, etc |  |
|**value** | **String** | the value of the decision scope : an IP, a range, a username, etc |  |
|**duration** | **String** | the duration of the decisions |  |
|**until** | **String** | the date until the decisions must be active |  [optional] |
|**scenario** | **String** |  |  |
|**simulated** | **Boolean** | true if the decision result from a scenario in simulation mode |  [optional] [readonly] |



