package com.lmj.deme;


       
	    /**
	     * �� Dome1,����++��--�������1.���÷�  2.����ǰ�档3.���ں��档��
	     * 
	     */
	public class Dome1 {
//		���÷�
		
		public void test1(){
			
//			a++,����������ӡ�
			
			int a = 10;
			    
		    a++;
			System.out.println("a++:" + a++);
			
//		    ++b���ȼ������㡣
		    int b=10;

		     System.out.println("++b:" + ++b );
		}
		
		public void test2(){
//			 a--,�������ټ�
			int a = 10;
			a--;
			System.out.println("a--:"+ a--);
			
//			--b���ȼ�������
			
			int b = 20;
			   
			    System.out.println("--b:"+ --b);
//						
		}
		public void test3(){
			
			int a = 10;
			int b = 20;
			
			int m=a>b ? a:b;
			    
			     System.out.println("m:" +m);
			     
		    int c = 59;
		    
		    boolean p=c >=60 ?  true : false;
		    
		       System.out.println("p:" +p);
		       
		       
		   int d =30;
		   
		   char L = d >= 80 ? 'A' : (d >= 60 ? 'B' : 'C');
		   
		        System.out.println("L:" +L);
		}
		
		
		
		
	}
	
	       
	       
	
	
	
	
	
	
	
	
	
	
	
	
