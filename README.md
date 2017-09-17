# bpmn-helloworld
> HelloWorl with BPMN in WSO2 EI 6.1.1 and WSO2 EI 6.1.1 Tooling

## Try This
1. Download [WSO2 EI 6.1.1](https://wso2.com/integration#download), or retrieve through the [WSO2 Update Manager](http://wso2.com/wum).
2. Unzip the product to a preferred location.
3. Go to `<WSO2EI_HOME>/bin/` and run `business-process.sh` to start the server.
4. After the server starts (wait until line `Mgt Console URL  : https://127.0.0.1:9445/carbon/` line appears), navigate to the Management console, and login using the credentials `admin:admin`.
5. Deploy the `HelloWorldServiceTaks_CAR_1.0.0.car` file using `Carbon Applications`->`Add` option.
6. Wait until the CAR file is deployed (wait until the line `Successfully Deployed Carbon Application : HelloWorldServiceTaks_CAR_1.0.0 {super-tenant}` appears).
7. Deploy the `HelloWorld.bar` file using `Processes`->`Add`->`BPMN` option.
8. Wait until the BAR file is deployed.
9. Navigate to the BPMN Explorer (on `127.0.0.1` this would be at `https://127.0.0.1:9445/bpmn-explorer`)
10. Go to `Processes` tab and click on `Start` button in front of the process `HelloWorld-1`.
11. A log line with the contents `Hello World from the Hello World Service Task!!!` will appear in the terminal. This indicates the Service Task is successfully invoked. 

```
$ cd wso2ei-6.1.1/bin
$ ./business-process.sh
JAVA_HOME environment variable is set to /home/chamilad/dev/java/jdk1.8.0_77
CARBON_HOME environment variable is set to /home/chamilad/dev/wso2ei-6.1.1/wso2/business-process
Using Java memory options: -Xms256m -Xmx1024m
[2017-09-17 17:41:48,136] [EI-Business-Process]  INFO {org.wso2.carbon.core.internal.CarbonCoreActivator} -  Starting WSO2 Carbon...
[2017-09-17 17:41:48,139] [EI-Business-Process]  INFO {org.wso2.carbon.core.internal.CarbonCoreActivator} -  Operating System : Linux 4.4.0-93-generic, amd64
...
...
...
[2017-09-17 17:42:32,509] [EI-Business-Process]  INFO {org.wso2.carbon.core.internal.StartupFinalizerServiceComponent} -  Server           :  WSO2 Business Process Server-3.6.0
[2017-09-17 17:42:32,511] [EI-Business-Process]  INFO {org.wso2.carbon.core.internal.StartupFinalizerServiceComponent} -  WSO2 Carbon started in 50 sec
[2017-09-17 17:42:32,849] [EI-Business-Process]  INFO {org.wso2.carbon.ui.internal.CarbonUIServiceComponent} -  Mgt Console URL  : https://127.0.0.1:9445/carbon/
[2017-09-17 17:42:32,851] [EI-Business-Process]  INFO {org.wso2.carbon.ui.internal.CarbonUIServiceComponent} -  BPS BPMN Explorer : https://127.0.0.1:9445/bpmn-explorer
[2017-09-17 17:42:32,851] [EI-Business-Process]  INFO {org.wso2.carbon.ui.internal.CarbonUIServiceComponent} -  BPS HumanTask Explorer : https://127.0.0.1:9445/humantask-explorer
...
...
...
[2017-09-17 17:46:02,323] [EI-Business-Process]  INFO {org.wso2.carbon.application.deployer.internal.ApplicationManager} -  Deploying Carbon Application : HelloWorldServiceTaks_CAR_1.0.0.car...
[2017-09-17 17:46:04,366] [EI-Business-Process]  INFO {org.wso2.carbon.application.deployer.handler.DefaultAppDeployer} -  OSGi bundle in file:///home/chamilad/dev/wso2ei-6.1.1/wso2/business-process/tmp/carbonapps/-1234/1505684762324HelloWorldServiceTaks_CAR_1.0.0.car/HelloWorldServiceTask_Artifact_1.0.0/HelloWorldServiceTask_Artifact-1.0.0.jar location is about to be installed to Carbon Server.
[2017-09-17 17:46:04,371] [EI-Business-Process]  INFO {org.wso2.carbon.application.deployer.handler.DefaultAppDeployer} -  OSGi bundle HelloWorldServiceTask_Artifact installed to Carbon Server.
[2017-09-17 17:46:04,379] [EI-Business-Process]  INFO {org.wso2.carbon.application.deployer.handler.DefaultAppDeployer} -  OSGi bundle HelloWorldServiceTask_Artifact successfully started on Carbon Server.
[2017-09-17 17:46:04,382] [EI-Business-Process]  INFO {org.wso2.carbon.application.deployer.internal.ApplicationManager} -  Successfully Deployed Carbon Application : HelloWorldServiceTaks_CAR_1.0.0 {super-tenant}
...
...
...
[2017-09-17 17:48:04,492] [EI-Business-Process]  INFO {org.wso2.carbon.bpmn.core.deployment.BPMNDeployer} -  Deploying BPMN archive HelloWorld.bar for tenant: -1234
[2017-09-17 17:48:04,503] [EI-Business-Process]  INFO {org.activiti.engine.impl.bpmn.deployer.BpmnDeployer} -  Processing resource HelloWorldBPMN/src/main/resources/diagrams/HelloWorld.bpmn
[2017-09-17 17:49:27,733] [EI-Business-Process]  INFO {JAGGERY.model.common:jag} -  Starting BPMN-explorer in default configuration
[2017-09-17 17:49:30,840] [EI-Business-Process]  INFO {org.wso2.carbon.core.services.util.CarbonAuthenticationUtil} -  'admin@carbon.super [-1234]' logged in at [2017-09-17 17:49:30,840-0400]
[2017-09-17 17:49:31,331] [EI-Business-Process]  INFO {JAGGERY.model.common:jag} -  BPS Substitution Feature Status : Disabled
...
...
...
Hello World from the Hello World Service Task!!!
```
