package com.sample;

public abstract class abs {
	
	int a;
	String b;
abs(){
	System.out.println("hello");
}
abs(int a,String b){
	this.a=a;
	this.b=b;
	System.out.println("arg"+ a+" "+b);
}

}
class names extends abs{
	names(){
		super(1,"ab");
	}
	public static void main(String args) {
		names na=new names();
		}
}