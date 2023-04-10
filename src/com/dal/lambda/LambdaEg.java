package com.dal.lambda;

public class LambdaEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Runnable r = new MyTaskThread();
//		Thread thread = new Task();
//		thread.start();
//		
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Task task = new Task();
//				task.connect();
//				
//			}
//		};
//	}
		
//		java 8
//		Runnable r =  () -> {
//			Task task = new Task();
//			task.connect();
//		}
//		Thread t1 = new Thread();
//		t1.start();
		
		
		Thread th1 = new Thread( () ->{
			Task task = new Task();
			task.connect();
		}
			
		}
				
				);
		
}
