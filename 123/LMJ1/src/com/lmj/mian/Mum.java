package com.lmj.mian;
/**
 * ����
 * ���ԣ�  ����   ����  ����
 * ������ ��   ����   ����   ˯��
 *
 */


//����
public class Mum {
    private String name="";
    private int age=0;
    private String hobby="";
    //����
    public  Mum( String name,int age,String hobby){
    	this.name=name;
    	this.age=age;
    	this.hobby=hobby;
    }
    //����
    public void getup(){
		System.out.println(getName()+"����");
	}
	public void worke(){
		System.out.println(getName()+"�ϰ�");
	}
	public void play(){
		System.out.println(getName()+"����");
	}
	public void sleep(){
		System.out.println(getName()+"��");
	}
	//���ҽ���
		public void infor(){
			System.out.println("name:"+getName()+"age"+getAge()+"hobby"+getHobby()
					);
			
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

   


