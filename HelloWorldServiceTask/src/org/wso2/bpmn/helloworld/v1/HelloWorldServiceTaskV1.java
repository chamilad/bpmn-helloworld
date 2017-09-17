package org.wso2.bpmn.helloworld.v1;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class HelloWorldServiceTaskV1 implements JavaDelegate {

	@Override
	public void execute(DelegateExecution delegateExec) throws Exception {
		System.out.println("Hello World from the Hello World Service Task!!!");
	}

}
