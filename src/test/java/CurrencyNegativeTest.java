import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class CurrencyNegativeTest {

    @Test
    public void invalidTokenTest(){
        Response response = given().auth().oauth2("usb").contentType("application/json").get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN);
        System.out.println(response.asString());
        response.then().statusCode(200);
      //  response.then().body("info", equalTo("Access Restricted"));
       // response.then().body("message", containsString("Unautho"));

    }

}




