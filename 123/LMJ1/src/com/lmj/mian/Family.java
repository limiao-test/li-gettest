package com.lmj.mian;
/**
 * 
 *��ͥ��Ա
 *���ԣ�  үү  ����  ����
 *������  ��  ����  ��  ˯��  
 *
 */
public class Family {
  //����
    private Grandma grandma=null;
    private Grandpa grandpa=null;
    private Mum mum=null;
    //����
    public Family(Grandma grandma,Grandpa grandpa,  Mum mum ){
    	this.grandma=grandma;
    	this.grandpa=grandpa;
    	this.mum=mum;    			
    }
    public void infor() {
		grandpa.infor();
		grandma.infor();
		
	}

    //����
   public void daystart(){
	    grandpa.getup();
		grandma.getup();
		mum.getup();	   
   }
   private void worke() {
		// ����
		grandpa.worke();
		grandma.worke();
		mum.worke();
	}
   private void play() {
		// ����
		grandpa.play();
		grandma.play();
		mum.play();
	}
   private void dayEnd() {
		grandpa.sleep();
		grandma.sleep();
		mum.sleep();
	}
   public void day(){
		daystart();
		worke();
		play();
		dayEnd();
	}
	public Grandma getGrandma() {
		return grandma;
	}
	public void setGrandma(Grandma grandma) {
		this.grandma = grandma;
	}
	public Grandpa getGrandpa() {
		return grandpa;
	}
	public void setGrandpa(Grandpa grandpa) {
		this.grandpa = grandpa;
	}
	public Mum getMum() {
		return mum;
	}
	public void setMum(Mum mum) {
		this.mum = mum;
	}
    
}
