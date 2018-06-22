package cn.com.hsbc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 6/22/18.
 */
public class MathGame {


    private StringBuffer sb;
    private int remainder_3;
    private int remainder_5;

    public MathGame() {
        sb = new StringBuffer();
    }

    public String getResultByNumber(int i) {
        sb.setLength(0);
        remainder_3 = i % 3;
        remainder_5 = i % 5;
        if (remainder_3 == 0) {
            sb.append("Fizz");
        }
        if (remainder_5 == 0) {
            sb.append("Buzz");
        }
        if (sb.length()==0){
            sb.append(i);
        }
        return sb.toString();
    }


    public List<String> getHundredResults() {
        List<String> tmpList = new ArrayList<String>();
        String tmpNumber;
        for (int i = 1; i < 101; i++) {
            tmpNumber = getResultByNumber(i);
            System.out.println(tmpNumber);
            tmpList.add(tmpNumber);
        }
        return tmpList;
    }
}
