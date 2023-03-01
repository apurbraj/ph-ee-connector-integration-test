package org.mifos.integrationtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ZeebeOperationsConfig {
    @Value("${zeebe-operations.contactpoint}")
    public String zeebeOperationContactPoint;

    @Value("${zeebe-operations.endpoints.workflow}")
    public String workflowEndpoint;

    @Value("${zeebe-operations.endpoints.upload-bpmn}")
    public String uploadBpmnEndpoint;

    @Value("${zeebe-operations.no-of-workflows}")
    public int noOfWorkflows;

}
