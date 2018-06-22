package cn.com.hsbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by alex on 6/22/18.
 */
public class MathGameTest {

    private MathGame mathGame;
    
    @Before
    public void setUp() throws Exception {
        mathGame = new MathGame(); 
    }
    @Test
    public void isDivisedBy3() throws Exception {
        Assert.assertEquals(false,mathGame.isDivisedBy3(1));
        Assert.assertEquals(true,mathGame.isDivisedBy3(3));
        Assert.assertEquals(true,mathGame.isDivisedBy3(24));
    }

    @Test
    public void isDivisedBy5() throws Exception {
        Assert.assertEquals(false,mathGame.isDivisedBy5(1));
        Assert.assertEquals(true,mathGame.isDivisedBy5(5));
        Assert.assertEquals(true,mathGame.isDivisedBy5(25));
    }

    @Test
    public void getResultByNumberStage1() throws Exception {
        Assert.assertEquals("1",mathGame.getResultByNumberStage1(1));
        Assert.assertEquals("Fizz",mathGame.getResultByNumberStage1(3));
        Assert.assertEquals("Buzz",mathGame.getResultByNumberStage1(5));
        Assert.assertEquals("Fizz",mathGame.getResultByNumberStage1(6));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumberStage1(15));
    }


    @Test
    public void getHundredResultsStage1() throws Exception {
        MathGame mathGame = new MathGame();
        List<String> tmpList = mathGame.getHundredResultsStage1();
        Assert.assertEquals(100, tmpList.size());
    }

    @Test
    public void isContains3() throws Exception {
        Assert.assertEquals(false,mathGame.isContains3(1));
        Assert.assertEquals(true,mathGame.isContains3(3));
        Assert.assertEquals(true,mathGame.isContains3(23));
    }

    @Test
    public void isContains5() throws Exception {
        Assert.assertEquals(false,mathGame.isContains5(1));
        Assert.assertEquals(true,mathGame.isContains5(5));
        Assert.assertEquals(true,mathGame.isContains5(51));
    }

    @Test
    public void getResultByNumberStage2() throws Exception {
        Assert.assertEquals("1",mathGame.getResultByNumberStage2(1));
        Assert.assertEquals("Fizz",mathGame.getResultByNumberStage2(3));
        Assert.assertEquals("Buzz",mathGame.getResultByNumberStage2(5));
        Assert.assertEquals("Fizz",mathGame.getResultByNumberStage2(6));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumberStage2(15));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumberStage2(53));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumberStage2(57));
        Assert.assertEquals("FizzBuzz",mathGame.getResultByNumberStage2(35));
    }


    @Test
    public void getHundredResultsStage2() throws Exception {
        MathGame mathGame = new MathGame();
        List<String> tmpList = mathGame.getHundredResultsStage2();
        Assert.assertEquals(100, tmpList.size());
    }

}