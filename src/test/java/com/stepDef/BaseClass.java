package com.stepDef;

import org.apache.log4j.Logger;

import com.Managers.FileReaderManager;
import com.TestdataTypes.User;

public class BaseClass {
	
	User testdata=FileReaderManager.getInstance().getJsonReader().getTestDataByID("01");
	public static Logger log;

}
