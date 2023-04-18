package com.order;
import java.io.*;

public class Javaio {

	public static void main(String[] args) {
		int x,y,z;
		try {
			InputStreamReader ip = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(ip);
			System.out.println("Enter x:");
			x = Integer.parseInt(bf.readLine());
			System.out.println("Enter y:");
			y = Integer.parseInt(bf.readLine());
			z=x+y;
			System.out.println("z:"+z);
		}
		catch(Exception e) {
			System.out.println("error");
		}
		finally {
			System.out.println("Final");
		}
	}

}
