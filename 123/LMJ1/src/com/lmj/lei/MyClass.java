package com.lmj.lei;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * �༶��
 * 1.���ԣ��༶������     ������   ѧ��
 * 2.�������ܳɼ�   ƽ���ɼ�   ������intro
 *
 */
public class MyClass {
 //����
	  private String name;
	  private String boss;
	  private Student[] students;
 //����
	  public MyClass(String name ,String boss, Student[] students){
		  this.name=name;
		  this.boss=boss;
		  this.students=students;
	  }
//����
	 	public void intro(){
	 		String info="";
	 		info += "name:"+name+"\n"+"boss:"+boss+"\n";
	 		System.out.println(info);
	 		for (Student s : students) {
				s.intro();
			}
// ���
			 System.out.println(info);
	 	
	  }	  

	 	public void max(){
	 		int max=0;
	 		for(Student s : students){
	 			if (max < s.total()) {
					max =s.total();
				}
	 		}
	 		System.out.println("max:" +max);	 	
	 	}
		public void min(){
	 		int min=90;
	 		for(Student s : students){
	 			if (min > s.total()) {
					min =s.total();  
				}
	 		}
	 		System.out.println("min:" +min);	 	
	 	}
	     public int total(){
	    	 int  total=0;
	    	 for(Student s : students){
	    	 total += s.total();
	    	 	    	  	     }	
	    	 System.out.println("total:" +total);
  	         return total;
 	  }
	     public void avg(){
	    	 int avg=0;
	    	  avg=total()/students.length;
	    	  System.out.println("avg:"+avg);
	     }
	     public void  sort(){
	    	 for(Student s : students){
	    		 
	    		 System.out.println(s.getName());
	    		 
	    	 }
	    	 //�Ӵ�С��λ
	    	 for (int j = 0; j < students.length-1; j++) {
	 			
	 			for (int i = 0; i < students.length-j-1; i++) {
	 				Student temp = null;
	 				if (students[i].total() < students[i+1].total()) {
	 					temp = students[i];
	 					students[i] = students[i+1];
	 					students[i+1] = temp;
	 				}
	 			}
	    	 }
	     }
}
	    		 
	    	 
	     

	  

