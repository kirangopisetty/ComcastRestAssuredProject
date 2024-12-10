package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class deleteUserDeleteAPIDDTApproach3 extends testDataForDDT {
	
	@Test (dataProvider = "deleteUserDDT")
	public void deleteUser(Object idToDelete) {
		
		System.out.println("The ID being deleted now is "+idToDelete);
		given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer a1acf13036e08546446ecbcbeb75b11959fbfcc0795218a185cfc982f6982c29")

		.when()
			.delete("https://gorest.co.in/public/v2/users/"+idToDelete)
		
		.then()
			.statusCode(204);
	}
}