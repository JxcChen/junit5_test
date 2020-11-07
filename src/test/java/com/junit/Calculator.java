package com.junit;

public class Calculator {

    private static int result;
    /**
     * 加法
     * @param a 数字a
     * @param b 数字b
     * @return a+b
     */
    public static int add(int a,int b){
        result = a + b;
        return result;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return a-b
     */
    public static int sub(int a,int b){
        result = a - b;
        return result;
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return a*b
     */
    public static int multiply(int a,int b){
        result = a * b;
        return result;
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return a/b
     */
    public static int divide(int a,int b){
        result = a / b;
        return result;
    }

    /**
     * 累加器
     * @param a 累加值
     * @return 累加和
     */
    public static int accumulator(int a) throws InterruptedException {
        Thread.sleep(1000);

        result += a;
        return result;

    }
}
