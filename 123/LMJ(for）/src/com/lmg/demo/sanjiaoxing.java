package com.lmg.demo;
/**
 * 
 * ֱ��������
 *����������ѭ������  i��j  ����iΪ���ѭ��������jΪ�ڲ�ѭ��������
 */
public class sanjiaoxing {

	    public void sjx(){
	    	int i, j;
	    	for(i=1;i<=9;i++){
	    		for(j=1;j<=i;j++){
	    			System.out.print( "*");
	    		}
	    		
	    		System.out.print("\n");
	    	}
	    	
	    }
	public void  sjx1(){
		int i,  j;
		for(i=0;i<=9;i++){
			for(j=0;j<=9-i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
	public void sjx3(){
		  int i,j;
		  for( i=1;i<=5;i++){
			  for( j=1;j<=i;j++){
				  System.out.print("@");
			  }
			  System.out.println("\n");
		  }
	}
	
}
