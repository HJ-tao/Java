package oo.day06;

import java.util.Scanner;

public class UnionPayTest {

	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		UnionPay card = new ICBCImpl(3000,"ablald");
		atm.insertCard(card);
		System.out.println("请输入密码:");
		Scanner sc = new Scanner(System.in);
		String pass = sc.next().trim();
		if(card.checkPwd(pass)){
			while(true){
				atm.allMenu();
			}
		}else{
			System.out.println("密码错误.");
		}
	}

}

interface UnionPay{
	public abstract double getBalance();//获取余额
	boolean drawMoney(double number);  //取钱
	public boolean checkPwd(String input);  //检查密码
}

interface ICBC extends UnionPay{
	public void payOnline(double number);   //网上支付
}


class ICBCImpl implements ICBC{
	private double money;
	private String pwd;
	
	public ICBCImpl(double money,String pwd){
		this.money = money;
		this.pwd = pwd;
	}
	
	public double getBalance(){
		return money;
	}
	
	public boolean drawMoney(double number){
		if(money>=number){
			money-=number;
			return true;
		}
		return false;
	}
	
	public boolean checkPwd(String input){
		if(pwd.equals(input)){
			return true;
		}
		return false;
	}
	
	public void payOnline(double number){
		if(money>=number){
			money-=number;
		}
	}
	
}

interface ABC extends UnionPay{
	public boolean payTelBill(String telNumber,double number);
}

class ABCImpl implements ABC{
	private double balance;
	private String password;
	
	public ABCImpl(double balance,String password){
		this.balance = balance;
		this.password = password;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public boolean drawMoney(double number){
		if(balance>=number){
			balance-=number;
			return true;
		}
		return false;
	}
	
	public boolean checkPwd(String input){
		if(password.equals(input)){
			return true;
		}
		return false;
	}
	
	public boolean payTelBill(String telNumber,double number){
		System.out.println("支付成功.");
		return true;
	}
		
}

class ABCATM{
	private UnionPay card;
	
	public void insertCard(UnionPay card){
		if(this.card==null){
			this.card = card;
			System.out.println("卡已插入.");
		}
	}
	
	public void outCard(UnionPay card){
		if(this.card!=null){
			System.out.println("取卡成功.");
			this.card = null;
		}
	}
	
	public void payTelBill(String phoneNum,double num){
		if(card instanceof ABCImpl){
			ABCImpl abcard = (ABCImpl)card;
			abcard.payTelBill(phoneNum, num);
		}else{
			System.out.println("不是农行卡,不能支付.");
		}
	}
	
	public void showBalance(){
		System.out.println("您的余额为:"+card.getBalance());
	}
	
	public void takeMoney(double num){
		if(card.drawMoney(num)){
			System.out.println("取款成功.");
		}else{
			System.out.println("取款失败.");
		}
	}
	
	public void allMenu(){
		System.out.println("请选择功能:");
		System.out.println("1.查看余额 2.取款  3.缴电话费");
		Scanner sc = new Scanner(System.in);
		int func = sc.nextInt();
		switch(func){
		    case 1:
		    	showBalance();
		    	break;
		    case 2:
		    	System.out.println("请输入取款金额:");
		    	double money = sc.nextDouble();
		    	takeMoney(money);
		    	break;
		    case 3:
		    	System.out.println("输入电话号码:");
		        String phoneNum = sc.next().trim();
		        System.out.println("输入金额:");
		        double num = sc.nextDouble();
		        payTelBill(phoneNum,num);
		        break;
		}
	}
}

