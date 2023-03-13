package com.ll;

public class Calc {
    public static int run(String exp) {
        String[] bits = null;
        int sum = 0;
        if(exp.contains("*") && exp.contains("+")){
            bits = exp.split(" \\+ ");
            for (String num : bits) {
                System.out.println("num = " + num);

                if(num.contains("*")){
                    sum += run(num);
                } else{
                    sum += Integer.parseInt(num);
                }
            }
        } else if (exp.contains("*")) {
            ++sum;
            bits = exp.split(" \\* ");
            for (String num : bits) {
                int n = Integer.parseInt(num);
                sum *= n;
            }
        } else{
            exp = exp.replace("- ", "+ -");
            int result = 0;

            bits = exp.split(" \\+ ");
            for (String num : bits) {
                int n = Integer.parseInt(num);
                sum += n;
            }
        }
        return sum;
    }
}
