package apiTesting;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
//io.restassured.matcher.RestAssuredMatchers.*
//org.hamcrest.Matchers.*
public class GetRequest {
	
	

	public static void main(String[] args) {
		
		Response response = given().queryParam("limit", "1").auth().basic("sk_test_fCbcxDHN80UZs3gtG3hGenMa0039UdRui9", "").get("https://api.stripe.com/v1/customers");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		//response.prettyPrint();
		
	}
}
