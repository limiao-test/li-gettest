package com.lmj.lei;
/**
 * ѧ��
 * ����    name  age  gender  english chinese  match
 * 
 * ����    total  avg   intro
 */
public class Student {
//	����
     private  String name;   
     private String gender;
     private int age;
     private int  match;
     private int  english;    
     private int  chinese;
  
    //����
     public Student(String name,String gender,int age,int  match,int  english,int  chinese){
    	 this.name=name;
    	 this.gender=gender;
    	 this.age=age;
    	 this.match=match;
    	 this.english=english;
    	 this.chinese=chinese;
     }
     //����
      public void intro(){   //���ҽ���
    	   String info="name:"+name+"\n"
    			   +"gener:"+gender+"\n"
    			   +"age:"+age+"\n"
    			   +"match:"+match+"\n"
    			   +"english:"+english+"\n"
    			   +"chinese:"+chinese+"\n";
    	   
    	   System.out.println(info);
      }
      public int total(){  //�ܺ�
    	  int t=english + chinese+ match;
    	  System.out.println("total:"  +t);
    	  return  t ;
      }
      public int avg(){   //ƽ��ֵ
    	  int avg=total() / 3;
    	  System.out.println("avg:"  +avg);
    	  return  avg;
      }
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatch() {
		return match;
	}
	public void setMatch(int match) {
		this.match = match;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
   
}
