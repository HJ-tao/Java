package oo.day05;

import java.util.Scanner;

public class UnionPayTest {

	public static void main(String[] args) {
		UnionPay icbc = new ICBCImpl(2000,"abcds");
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入密码:");
		if(icbc.checkPwd(sc.next())){
			System.out.print("请输入金额:");
			if(icbc.drawMoney(sc.nextDouble())){
				System.out.println("取钱成功,卡余额为"+icbc.getBalance());
			}else{
				System.out.println("卡中余额不足.");
			}
		}else{
			System.out.println("密码错误.");
		}
		sc.close();
	}
}

interface UnionPay{
	public double getBalance(); //获取余额
	public boolean drawMoney(double number);//取钱
	public boolean checkPwd(String input);//检查密码正确性
}

interface ICBC extends UnionPay{
	public void payOnlion(double number);//在线支付
}

interface ABC extends UnionPay{
	public boolean payTelBill(String phoneNum,double num);  //支付电话费
}

class ICBCImpl implements ICBC{
	private double saveMoney;
	private String password;
	
	public ICBCImpl(double saveMoney,String password){
		this.saveMoney = saveMoney;
		this.password = password;
	}
	
	public double getBalance(){
		return saveMoney;
	}
	
	public boolean drawMoney(double number){
		if(saveMoney>number){
			saveMoney -= number;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkPwd(String input){
		if(password.equals(input)){
			return true;
		}else{
			return false;
		}
	}
	
	public void payOnlion(double number){
		if(number<saveMoney){
			saveMoney -= number;
		}
    }
	

}

class ABCImpl implements ABC{
	private double balance;
	private String password;
	
	public ABCImpl(double balance,String password){
		this.balance = balance;
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public boolean drawMoney(double number) {
		if(balance-number>-2000){
			balance -= number;
			return true;
		}else{
			return false;
		}
	}

	public boolean checkPwd(String input) {
		if(password.equals(input)){
			return true;
		}else{
			return false;
		}
	}

	public boolean payTelBill(String phoneNum, double num) {
		if(balance-num>-2000 && phoneNum.length()==11){
			balance -= num;
			return true;
		}else{
			return false;
		}
	}
	
}

interface CCB extends UnionPay{
	public abstract boolean payGasBill(double fee);
}

class CCBImpl implements CCB{
	private double balance;
	private String pwd;
	
	public CCBImpl(double balance,String pwd){
		this.balance = balance;
		this.pwd = pwd;
	}

	public double getBalance() {
		return balance;
	}

	public boolean drawMoney(double number) {
		if(number<=balance){
			balance -= number;
			return true;
		}
		return false;
	}

	public boolean checkPwd(String input) {
		if(pwd.equals(input)){
			return true;
		}
		return false;
	}

	public boolean payGasBill(double fee) {
		if(fee<=balance){
			balance-=fee;
			return true;
		}
		return false;
	}
	
}
