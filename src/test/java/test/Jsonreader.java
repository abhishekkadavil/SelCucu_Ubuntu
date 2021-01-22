package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.TestdataTypes.TestData1;
import com.TestdataTypes.TestData2;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Jsonreader {
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
			System.out.println("singam");
			
			Gson gson = new Gson();

		    // 1. JSON file to Java object
		    //TestData TestData = gson.fromJson(new FileReader("C:\\projects\\staff.json"), TestData.class);

		    // 2. JSON string to Java object
		    //String json = "{'name' : 'mkyong'}";
		    //TestData TestData = gson.fromJson(json, TestData.class);
		        
		    // 3. JSON file to JsonElement, later String
		    JsonElement json = gson.fromJson(new FileReader("/home/qbuser/Kadavil/EclipseWorkspace/SelCucu_Ubuntu/src/test/java/com/TestData/Scenario01.json"), 
		    		JsonElement.class);
		    String result = gson.toJson(json);
		    //System.out.println(result);
		    TestData2[] TestDataArray = gson.fromJson(result, TestData2[].class);
		    System.out.println(TestDataArray[0].toString());
		    List<TestData2> testdaList = Arrays.asList(TestDataArray);
		    System.out.println(testdaList.toString());
		    List<TestData2> ab= testdaList.stream().filter(Id -> {
		    	return Id.getID().equals("01");
		    }).collect(Collectors.toList());
		    System.out.println(ab.get(0).getLoginCredentail().getUsername());
	}

}
