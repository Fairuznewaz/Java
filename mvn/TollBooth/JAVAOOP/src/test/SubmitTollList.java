package TollBoothTest;

import com.TollBooth.SubmitToll;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubmitTollTest {

    @Test
    public void submitToll(){
        SubmitToll toll=new SubmitToll();
        Response st=toll.submitToll();

        Assert.assertEquals(st.jsonPath().get("statusCode"),Integer.valueOf(200));
        Assert.assertEquals(st.jsonPath().get("message"),"success");

    }
}