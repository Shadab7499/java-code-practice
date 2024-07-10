package com.problem;// Java Program to Swap Two Numbers
import java.util.*;

class SwapTwoNumbers {

public static void swapValuesUsingThirdVariable(int m, int n) {
int temp = m;
m = n;
n = temp;
System.out.println("Value of m is: " + m + " and Value of n is: " + n);
}
public static void main(String[]args){
int m=2, n=6;
swapValuesUsingThirdVariable(m,n);
}

}