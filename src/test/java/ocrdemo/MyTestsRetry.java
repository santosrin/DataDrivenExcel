package ocrdemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyTestsRetry {

    @Test
    public void test1() {
        Assert.assertEquals(false,true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(false,true);
    }

    @Test
    public void test3() {
        Assert.assertEquals(true,true);
    }
}
