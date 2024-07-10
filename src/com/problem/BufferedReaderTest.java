package com.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
public static void main(String[]args) 
throws IOException {
	
	InputStreamReader inputReader = new InputStreamReader(System.in);
 BufferedReader reader = new BufferedReader(inputReader);
String name = reader.readLine();
System.out.println(name);
}
}
