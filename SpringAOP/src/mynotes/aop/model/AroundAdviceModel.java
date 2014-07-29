package mynotes.aop.model;

import java.util.Random;

public class AroundAdviceModel {
	
	private String someString;

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		System.out.println(someString);
		this.someString = someString;
	}
	
	
	public int getRandomNumber(int upperLimit){	
		Random random=new Random();
		int result=random.nextInt(upperLimit);
		return result;
	}
	
	public int multiply(int x,int y){	
		return x*y;
	}
}
