steps to create tenant


OND model distribution..
distribute below on Test tenant.. through depircated.. config 

{
  "SDC_CredentialsForDistribution": "Test",
  "SDC_Configuration": {
    "KeyStorePassword": "/opt/ncso/var/lib/mft/keycert.p12",
    "KeyStorePath": "keyStorePath",
    "User": "COMCAST",
    "PollingTimeout": "0",
    "AsdcAddress": "sdc-be.harmonia:8443",
    "MsgBusAddress": "persistence-on-kafka.harmonia",
    "ConsumerId": "ncso",
    "queueTlsEnable": "false",
    "ServerTLSAuthEnable": "false",
    "UseHttpsWithDmaapEnable": "true",
    "PollingInterval": "0",
    "EnvName": "AUTO",
    "Password": "COMCAST123",
    "ConsumerGroup": "NCSO"
  }
} 



 complete the sequence of  models_with_plugin_changes through postman UI and give a tenant name while distributing
 distribute UI models through ncso csar models 
 
 distribute 3gpp 
 531 
 532 through  depricated 
 plugin management
 
 distribute rule1.zip through postman
 check the get url through depricated 
 
 
Policy rule package
GET /policy/rules-list/{domain}  
put value of domain as -  Planner


replan
 
 
 configuration -  on depricated post below
 NCSO Configuration for Attached model : 

{
  "POC_Artifacts_dedicatedfastembbslice_proxy0": {
    "nodeCode": "dedicatedfastembbslice_proxy 0",
    "attributeName": "maxNumberofUEs",
    "targetCapabilityName": "dedicatedfastembbns_proxy0.NumberOfUEs",
    "targetCapabilityType": "tosca.capabilities.Node"
  },
  "POC_Artifacts_sharedembbslice_proxy0": {
    "nodeCode": "sharedembbslice_proxy 0",
    "attributeName": "rmaxNumberofUEs",
    "targetCapabilityName": "sharedembbns_proxy0.NumberOfUEs",
    "targetCapabilityType": "tosca.capabilities.Node"
  }
}
NCSO Configuration : 
{
"NsmfCoreConfig": {
"baseUrl": "http://10.247.154.190:8080",
"jobStatusWaitTime": "3000",
"jobStatusRetryCounter": "20"
},
"NsmfRanConfig": {
"baseUrl": "http://10.247.154.190:8080/slice-mgr/v16.4.0",
"Content-Type": "application/x-www-form-urlencoded",
"ranWaitTime": "3000",
"ranRetryCounter": "20",
"limit": 7
}
}


 
 credential vault-
 RAN Credential Vault :

Core Credential Vault:

{
  "POC_Artifacts_dedicatedfastembbslice_proxy0": {
    "nodeCode": "dedicatedfastembbslice_proxy 0",
    "attributeName": "maxNumberofUEs",
    "targetCapabilityName": "dedicatedfastembbns_proxy0.NumberOfUEs",
    "targetCapabilityType": "tosca.capabilities.Node"
  },
  "POC_Artifacts_sharedembbslice_proxy0": {
    "nodeCode": "sharedembbslice_proxy 0",
    "attributeName": "rmaxNumberofUEs",
    "targetCapabilityName": "sharedembbns_proxy0.NumberOfUEs",
    "targetCapabilityType": "tosca.capabilities.Node"
  }
}


the correct one 

{
"POC_Artifacts_dedicatedfastembbslice_proxy0": {
"nodeCode": "dedicatedfastembbslice_proxy 0",
"attributeName": "maxNumberofUEs",
"targetCapabilityName": "dedicatedfastembbns_proxy0.NumberOfUEs",
"targetCapabilityType": "tosca.capabilities.Node"
},
"POC_Artifacts_sharedembbslice_proxy0": {
"nodeCode": "sharedembbslice_proxy 0",
"attributeName": "maxNumberofUEs",
"targetCapabilityName": "sharedembbns_proxy0.NumberOfUEs",
"targetCapabilityType": "tosca.capabilities.Node"
}
}




Policy rule package
GET /policy/rules-list/{domain}  
Planner


replan
 