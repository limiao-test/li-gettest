package com.lmg.demo;

public class Dome {
  
	   public void test1(int a,int b){
		   int c= 0;
		   
		   if(a==0){
			   System.out.println("c=" +c);
			   
			   return;			   
		   }  
		   if(b !=0){
			   c=a/b;
			   System.out.println("c=" +c);
		   }
	   }
	   
	   public void test2(int a, int b){
		    int c=0;
		    
		    if(b==0){
		    	System.out.println("��������Ϊ��");
		    }else{
		    	c=a/b;
		    	System.out.println("c="+c);		    	
		    }    	
		    }

	   public void test3(int income){
		   if(income==0){
		   System.out.println("��������");
		   return;
		   }
		   
		   String s="xxx";
		   if(income<=3000){
		    s="С����";
		    } else  if(income<=5000){
		    s="С����";
		    } else if (income<=8000){
		    s="����";
		    } else if (income<=1000){
		    s="����";
		    } else{
		    s="����";
		    }
		   System.out.println("����:"+income+"�ײ�:"+s);
	   }	
	   public void test4(int gender,int age,int height ){
		   if(gender==1 && age<=30 && height>180){
			   System.out.println("�ϸ�");
		   }
	   }
	   public void test5(int a, int b, int c){
		   if(a<=0 || b<=0 || c<=0){
			  System.out.println("��������");
			   return;
//			   ������д��������εı�Ҫ����
		 
			   
			   
		   }
		   
	   }
}
