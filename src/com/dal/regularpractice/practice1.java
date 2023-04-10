package com.dal.regularpractice;

//public class practice1 {
//
//	public static void main(String[] args) {
//		
//		int a = 5;
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//			System.out.println(a);
//		}
//		
//	}
//}

public class practice1 {
	String name;
	int id;
	
public practice1(String string, int i) {
		// TODO Auto-generated constructor stub
	this.name = string;
	this.id = i;
	
	}

//	public static void main(String[] args) {
//		practice1 swift = new practice1();
//		int s = swift.go();
//	}
//	
//	private int go() {
//		System.out.println("moving");
//		int y = 2;
//		return y;
//	}
	
	public static void main(String[] args) {
//		System.out.println("frm main mthd");
//		practice1 per1 = new practice1();
//		per1.fillform(2, "ragul");
//		per1.fillform("raja");
		practice1 p = new practice1("sss", 1);
		System.out.println(p);
	}
	
//	private void fillform(String s) {
//	// TODO Auto-generated method stub
//		System.out.println(s);
//	
//}
//
//	private void fillform(int s, String y) {
//		System.out.println("frm fillform mthd1");
//	}
	
}
