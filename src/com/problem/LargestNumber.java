package com.problem;

import java.io.*;
class LargestNumber {
static int biggestOfThree(int x, int y, int z) {
if (x>=y && x>=z)
return x;
else if (y>=x && y>=z)
return y;
else
return z;
}
public static void main(String[]args) {
int a,b,c, largest;
a = 4;
b = 12;
c = 2;
largest = biggestOfThree(a,b,c);
System.out.println(largest + " is a largest numnrt");
}
}