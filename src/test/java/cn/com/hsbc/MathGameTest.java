package cn.com.hsbc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alex on 6/22/18.
 */
public class MathGameTest {

    @Test
    public void testGetResult() {
        MathGame mathGame = new MathGame();
        Assert.assertEquals("1",mathGame.getResultByNumber(1));
        Assert.assertEquals("Fizz",mathGame.getResultByNumber(3));
        Assert.assertEquals("Buzz",mathGame.getResultByNumber(5));
        Assert.assertEquals("Fizz",mathGame.getResultByNumber(6));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumber(15));
    }

}