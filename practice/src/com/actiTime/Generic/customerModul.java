package com.actiTime.Generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class customerModul extends BaseClass {
	@Test
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
		
	
	}
	@Test(dependsOnMethods = "CreateCustomer")
	public void deleteCustomer() {
		Reporter.log("delecteCustomer",true);
	}

}

