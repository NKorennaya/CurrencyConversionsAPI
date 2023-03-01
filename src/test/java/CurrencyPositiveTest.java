import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CurrencyPositiveTest {
    private static Response response;

    //http://api.currencylayer.com/live?access_key=f68214866cefdfa851e5635bc71f768c&currencies

    @Test
    public void allCurrencies() {
        response = given().contentType("application/json").get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN+ Consts.CUR);
        System.out.println(response.asString());
    }
@Test
    public void usd(){
        response = given().get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN+ Consts.CUR + "USD");
    System.out.println(response.asString());
}
    @Test
    public void cad(){
        response = given().get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN+ Consts.CUR + "CAD");
        System.out.println(response.asString());
    }}
