package com.ll;

public class Calc {
    public static int run(String exp) {
        exp = exp.replace("- ", "+ -");
        String[] bits = null;
        int result = 0;

        bits = exp.split(" \\+ ");

        int sum = 0;
        for(String num : bits){
            int n = Integer.parseInt(num);
            sum += n;
        }

        return sum;
    }
}
