package com.lmj.lei;
/**
 * ��ʦ
 * ���ԣ�  ����  ����   ����  ��Ŀ
 * 
 *��Ϊ��  ����  ��ѧ   ��ҵ
 */
public class Teacher {
//	����
	private String name="����";
	private String age="12";
	private String love="ѧϰ";
	private String subject="����";
	
//	��Ϊ
	public void intro(){
		String info = "My name:" + name + "\nMy age:" + age + "\nMy love:" + love+"\nMysubject:"+subject;
		System.out.println(info);
	}
	
	public void teach(){
		System.out.println(name+":����:"+love);
	}
	public void subject(){
		System.out.println(name+":��Ŀ:"+subject);
	}
}
