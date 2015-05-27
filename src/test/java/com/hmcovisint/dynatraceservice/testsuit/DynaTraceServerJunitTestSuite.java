package com.hmcovisint.dynatraceservice.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.hmcovisint.dynatraceservicebroker.CredentialsTest;
import com.hmcovisint.dynatraceservicebroker.binding.BindingRequestTest;
import com.hmcovisint.dynatraceservicebroker.binding.BindingResponseTest;
import com.hmcovisint.dynatraceservicebroker.catalog.CatalogTest;
import com.hmcovisint.dynatraceservicebroker.catalog.CostTest;
import com.hmcovisint.dynatraceservicebroker.catalog.DashboardClientTest;
import com.hmcovisint.dynatraceservicebroker.catalog.PlanMetadataTest;
import com.hmcovisint.dynatraceservicebroker.catalog.PlanTest;
import com.hmcovisint.dynatraceservicebroker.catalog.ServiceMetadataTest;
import com.hmcovisint.dynatraceservicebroker.catalog.ServiceTest;
import com.hmcovisint.dynatraceservicebroker.provisioning.ProvisioningRequestTest;
import com.hmcovisint.dynatraceservicebroker.provisioning.ProvisioningResponseTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CredentialsTest.class,
	BindingRequestTest.class,
	BindingResponseTest.class,
	CatalogTest.class,
	CostTest.class,
	DashboardClientTest.class,
	PlanMetadataTest.class,
	PlanTest.class,
	ServiceMetadataTest.class,
	ServiceTest.class,
	ProvisioningRequestTest.class,
	ProvisioningResponseTest.class
	
})
public class DynaTraceServerJunitTestSuite {   
}