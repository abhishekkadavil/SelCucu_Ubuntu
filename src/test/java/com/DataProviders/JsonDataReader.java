package com.DataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.Managers.FileReaderManager;
import com.TestdataTypes.User;
import com.google.gson.Gson;

public class JsonDataReader {

	//private final String testDataFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataPath();
	private final String testDataFilePath = System.getProperty("user.dir")+"/src/test/java/com/TestData/"+FileReaderManager.getInstance().getConfigReader().getTestDataPath();
	private List<User> TestDataList;

	public JsonDataReader() {
		TestDataList = getTestData();
	}

	private List<User> getTestData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(testDataFilePath));
			User[] Userdata = gson.fromJson(bufferReader, User[].class);
			return Arrays.asList(Userdata);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + testDataFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final User getTestDataByID(String ID) {

		for (User Userdata : TestDataList) 
		{
			if (Userdata.getId().equalsIgnoreCase(ID))
				return Userdata;
		}
		return null;
	}

}
