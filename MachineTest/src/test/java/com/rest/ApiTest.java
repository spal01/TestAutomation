package com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;

public class ApiTest {
  @Test
  public void testApi() {
	  String bodyForTest="{\"id\":\"4\","+"\"title\":\"test1\"}";
	  RestAssured.baseURI="";
	  Response response=RestAssured.given().body(bodyForTest).when().contentType(ContentType.JSON).post("");
	  
	  Response response1=RestAssured.given().get("");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
