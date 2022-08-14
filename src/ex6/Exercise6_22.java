package ex6;

public class Exercise6_22 {
	
	static boolean isNumber(String str) {
		if(str==null || str=="")
			return false;
		
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c<'0' || c>'9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? " + isNumber(str));
		
		String str2 = "12g12";
		System.out.println(str2+"는 숫자입니까? " + isNumber(str2));
	}

}
