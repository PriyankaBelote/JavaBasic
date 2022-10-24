package com.techno.javabasics.multihreading;

public class MyThread1{
 public static void main(String[] args) {
	Runnable runnable=()->{
		
		for (int i = 0; i <=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+ Thread.currentThread().getName());
		}
	};
	
	Runnable runnable2=()->{
		
		for (char a = 'a'; a <='j'; a++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(a + Thread.currentThread().getName());
		}
	};
	
	Thread thread=new Thread(runnable);
	Thread thread2=new Thread(runnable2);
	thread.start();
	thread2.start();
			
}
}
