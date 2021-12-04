package com.company;

public class Main {
    public static void main(String[] args) {
        int n=10;
        int []a={1,2,3,4,6,7,8,9,10};
        int sum=(n*(n+1)/2);
        for(int b:a){
            sum=sum-b;
        }
        System.out.println("missing number is "+sum);
    }
}
