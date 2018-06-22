package cn.com.hsbc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 6/22/18.
 */
public class MathGame {


    private StringBuffer sb;

    public MathGame() {
        sb = new StringBuffer();
    }

    public String getResultByNumberStage1(int i) {
        sb.setLength(0);
        if (isDivisedBy3(i)) {
            sb.append("Fizz");
        }
        if (isDivisedBy5(i)) {
            sb.append("Buzz");
        }
        if (sb.length()==0){
            sb.append(i);
        }
        return sb.toString();
    }

    public boolean isDivisedBy3(int i) {
        return i % 3 == 0;
    }


    public boolean isDivisedBy5(int i) {
        return i % 5 == 0;
    }


    public String getResultByNumberStage2(int i) {
        sb.setLength(0);
        if (isDivisedBy3(i)||isContains3(i)) {
            sb.append("Fizz");
        }
        if (isDivisedBy5(i)||isContains5(i)) {
            sb.append("Buzz");
        }
        if (sb.length()==0){
            sb.append(i);
        }
        return sb.toString();
    }

    public boolean isContains3(int i) {
        return (i+"").contains("3");
    }


    public boolean isContains5(int i) {
        return (i+"").contains("5");
    }



    public List<String> getHundredResultsStage1() {
        System.out.println();
        System.out.println("******* start print result of stage1 *********");
        System.out.println();
        System.out.println();
        List<String> tmpList = new ArrayList<String>();
        String tmpNumber;
        for (int i = 1; i < 101; i++) {
            tmpNumber = getResultByNumberStage1(i);
            System.out.println(tmpNumber);
            tmpList.add(tmpNumber);
        }
        return tmpList;
    }

    public List<String> getHundredResultsStage2() {
        System.out.println();
        System.out.println("******* start print result of stage2 *********");
        System.out.println();
        System.out.println();
        List<String> tmpList = new ArrayList<String>();
        String tmpNumber;
        for (int i = 1; i < 101; i++) {
            tmpNumber = getResultByNumberStage2(i);
            System.out.println(tmpNumber);
            tmpList.add(tmpNumber);
        }
        return tmpList;
    }
}
