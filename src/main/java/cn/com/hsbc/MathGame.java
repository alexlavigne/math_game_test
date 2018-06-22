package cn.com.hsbc;

/**
 * Created by alex on 6/22/18.
 */
public class MathGame {


    public String getResultByNumber(int i) {
        int remainder_3 = i % 3;
        int remainder_5 = i % 5;
        if (remainder_3 == 0 && remainder_5 == 0) {
            return "FizzBuzz";
        } else if (remainder_3 == 0) {
            return "Fizz";
        } else if (remainder_5 == 0) {
            return "Buzz";
        } else {
            return i + "";
        }
    }

}
