import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class HistoricalCurrenciesTest {

    //private static Response response;


    @Test
    public void timeStampTest() {
        Response response = given().get(Consts.URL + Consts.ENDPOINT + Consts.TOKEN);
        System.out.println(response.asString());

        String expected = LocalDate.now().minusDays(1).toString();

        Integer actualMs = response.path("timestamp");
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = new Date((long)actualMs*1000);
        String actual = format.format(date2.getTime());
        Assertions.assertEquals(expected, actual);}

    }
