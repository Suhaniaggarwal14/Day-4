package com.graymatter;

public class CounterMain extends Thread{

	Counter cc;

	public CounterMain() {
		super();
	}

	public CounterMain(Counter cc) {
		super();
		this.cc = cc;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(currentThread().getId()+" ");
//			cc.updateCount();
			try {
				sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
//	
//	public static void main(String[] args) {
//		Counter cc=new Counter();
//		CounterMain cm1=new CounterMain(cc);
//		CounterMain cm2=new CounterMain(cc);
//		
//		cm1.start();
//		cm2.start();
//		
//	}
	
}