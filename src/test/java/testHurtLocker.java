import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testHurtLocker {

    @Test
    public void getStringTest() throws Exception {
        // List<String> shopping = new ArrayList<>();
        String firstString = JerksonParser.getStringFromResult((new Main()).readRawDataToString());
        Assert.assertEquals("naMe", firstString);
    }
}