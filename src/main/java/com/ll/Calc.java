package com.ll;

public class Calc {
    public static int run(String exp) {
        String[] bits = null;
        int result = 0;

        if (exp.contains("+")) {
            bits = exp.split(" \\+ ");
        } else if (exp.contains("-")) {
            bits = exp.split(" \\- ");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        if (exp.contains("+")) {
            return a + b;
        } else if(exp.contains("-")){
            return a - b;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");

    }
}
