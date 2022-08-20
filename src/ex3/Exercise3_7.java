package ex3;

public class Exercise3_7 {

	public static void main(String[] args) {
		//Math.round 사용 안하고 소수점 반올림 하기
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
