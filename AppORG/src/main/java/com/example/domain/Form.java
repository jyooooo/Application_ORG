package com.example.domain;

public class Form {


	/*@NotBlank (message = "商品名を入力して下さい。")*/
	private int num1 = 0 ;
	private int num2 = 0 ;
	private int total = 0 ;


	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public void sumTotal(){
		total=this.num1 + this.num2;
		setTotal(total);
	}





}
