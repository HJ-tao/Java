package day0912;

public class Rand {
	public int generateRandom(int lrange,double d,int max){  //小于lrange的随机数产生概率为d,随机数范围是0~max
		double newRate = Math.random();
		if(newRate<=d){
			return (int)(Math.random()*lrange);
		}else{
			return (int)(Math.random()*(max-lrange)+lrange);
		}
	}
	
	/*public static void main(String[] args) {
		int zero=0,one=0,two=0;
		for(int i=0;i<100;i++){
			int r = generateRandom(2,0.9,2);
			if(r==0){
				zero++;
			}else if(r==1){
				one++;
			}else{
				two++;
			}
		}
		System.out.println("zero:"+zero);
		System.out.println("one:"+one);
		System.out.println("two:"+two);
	}*/
}
