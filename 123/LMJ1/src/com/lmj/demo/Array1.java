package com.lmj.demo;
/**
 * 
 * ������  ��һ�������һ���������ڶ����͵����ڶ���������
 *
 */



public class Array1 {
        
	public void arr(){
		int[] arr={12,98,76,54,30};
//		arr.length����c��
	    int c=arr.length;
//	    �����Ļ�ֻ�ܽ���һ��  ����Ҫ�����ȳ���2
		for(int i=0; i<c/2;i++){
//			j����һ������   ��arr[i]����j
			int j=arr[i];
//			c-i=1�ǳ��ȼ�ȥ��һ��ѭ�����ټ�ȥһ�����±���Եĵ���������
			 arr [i]=arr[c-i-1];
//			 ���Ѿ��õ��ĵ�����������j  ѭ��
			 arr[c-i-1]=j;
		}
//		�ٴ�ѭ����������������
		for(int i=0; i<c;i++){
//			�õ����
			System.out.print(arr[i]+" ");
		}
	}
}
       
        
        	
       









