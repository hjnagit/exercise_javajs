package ex6;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);

		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
		
		System.out.println(s.info());
		
	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return Math.round((getTotal()/3f)*10)/10f;
//				(int)(getTotal()/3f+0.5f)*10f;
	}
	
	public String info() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage();
	}
}