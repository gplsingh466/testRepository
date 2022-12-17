package apiTesting;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
public class CreateCustomer {

	public static void main(String[] args) {
	
		String auth="sk_test_fCbcxDHN80UZs3gtG3hGenMa0039UdRui9";
		Response response = given().header("Authorization", "Bearer "+auth)
							.formParam("email", "test001@yopmail.com")
							.formParam("name", "test001")
							.post("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		System.out.println("Response status code-> "+response.getStatusCode());
}
}
