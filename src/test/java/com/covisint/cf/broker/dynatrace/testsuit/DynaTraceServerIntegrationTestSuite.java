package com.covisint.cf.broker.dynatrace.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.broker.dynatrace.binding.it.BindingControllerTest;
import com.covisint.cf.broker.dynatrace.catalog.it.CatalogControllerTest;
import com.covisint.cf.broker.dynatrace.provisioning.it.ProvisioningControllerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingControllerTest.class,
	CatalogControllerTest.class,
	ProvisioningControllerTest.class,
})
public class DynaTraceServerIntegrationTestSuite {   
}