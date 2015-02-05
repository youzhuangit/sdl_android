package com.smartdevicelink.test.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import com.smartdevicelink.proxy.rpc.enums.IgnitionStatus;

public class IgnitionStatusTests extends TestCase {

	public void testValidEnums () {	
		String example = "UNKNOWN";
		IgnitionStatus enumUnknown = IgnitionStatus.valueForString(example);
		example = "OFF";
		IgnitionStatus enumOff = IgnitionStatus.valueForString(example);
		example = "ACCESSORY";
		IgnitionStatus enumAccessory = IgnitionStatus.valueForString(example);
		example = "RUN";
		IgnitionStatus enumRun = IgnitionStatus.valueForString(example);
		example = "START";
		IgnitionStatus enumStart = IgnitionStatus.valueForString(example);
		example = "INVALID";
		IgnitionStatus enumInvalid = IgnitionStatus.valueForString(example);
		
		assertNotNull("UNKNOWN returned null", enumUnknown);
		assertNotNull("OFF returned null", enumOff);
		assertNotNull("ACCESSORY returned null", enumAccessory);
		assertNotNull("RUN returned null", enumRun);
		assertNotNull("START returned null", enumStart);
		assertNotNull("INVALID returned null", enumInvalid);
	}
	
	public void testInvalidEnum () {
		String example = "uNKnowN";
		try {
			IgnitionStatus.valueForString(example);
			fail("Sample string did not throw an IllegalArgumentException");
		}
		catch (IllegalArgumentException exception) {
			//If the method throws this exception then this test will be shown as passed.
		}
	}
	
	public void testNullEnum () {
		String example = null;
		try {
			IgnitionStatus.valueForString(example);
			fail("Sample string did not throw a NullPointerException");
		}
		catch (NullPointerException exception) {
			//If the method throws this exception then this test will be shown as passed.
		}
	}	
	
	public void testListEnum() {
 		List<IgnitionStatus> enumValueList = Arrays.asList(IgnitionStatus.values());

		List<IgnitionStatus> enumTestList = new ArrayList<IgnitionStatus>();
		enumTestList.add(IgnitionStatus.UNKNOWN);
		enumTestList.add(IgnitionStatus.OFF);
		enumTestList.add(IgnitionStatus.ACCESSORY);
		enumTestList.add(IgnitionStatus.RUN);
		enumTestList.add(IgnitionStatus.START);
		enumTestList.add(IgnitionStatus.INVALID);		
		
		assertTrue("Enum value list does not match enum class list", 
				enumValueList.containsAll(enumTestList) && enumTestList.containsAll(enumValueList));
	}
	
}
