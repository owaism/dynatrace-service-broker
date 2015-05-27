package com.hmcovisint.dynatraceservice.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.hmcovisint.dynatraceservicebroker.binding.it.BindingControllerTest;
import com.hmcovisint.dynatraceservicebroker.catalog.it.CatalogControllerTest;
import com.hmcovisint.dynatraceservicebroker.provisioning.it.ProvisioningControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingControllerTest.class,
	CatalogControllerTest.class,
	ProvisioningControllerTest.class,
})
public class DynaTraceServerIntegrationTestSuite {   
}