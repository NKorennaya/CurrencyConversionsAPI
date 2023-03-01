import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SecurityTests {
    private static Response response;

    @BeforeAll
    public static void setup() {
        response = given().get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN);
        System.out.println(response.asString());
//auth().oauth2(Consts.TOKEN).contentType("application/json").
    }

    @Test
    public void getAllResponseCodeTest() {
        response.then().statusCode(200);
    }


    @Test
    public void PerformanceTest() {
        response.then().time(lessThan(2000l));
    }


}