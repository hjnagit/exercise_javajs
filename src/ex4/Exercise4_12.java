package ex4;

public class Exercise4_12 {

	public static void main(String[] args) {
		//备备窜 老何 免仿
		int i,j;
		for(i=1; i<10; i++) {
			for(j=1; j<=3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0? 3 : i%3;
				
				if(x>9)
					break;
				
				System.out.print(x+"*"+y +"="+ (i*j)+"\t");
				
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}

		
	}

}
