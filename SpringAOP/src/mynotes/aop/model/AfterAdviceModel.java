package mynotes.aop.model;

import java.util.Random;

public class AfterAdviceModel {
	
	private String someString;

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		System.out.println(someString);
		this.someString = someString;
	}
	
	
	public int getRandomNumber(int upperLimit){	
		if(upperLimit<=0){
			throw new RuntimeException("Value cannot be <=0");
		}
		Random random=new Random();
		int result=random.nextInt(upperLimit);
		return result;
	}
}
