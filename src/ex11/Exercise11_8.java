package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다
		
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		// list에 저장된 객체를 하나씩 읽는다
		for(int i = 0; i<length; i++) {
			Student4 s = (Student4)list.get(i);
			// 총점을 기준으로 내림차순 정렬을 했기때문에 성립된다
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i+1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		} //for
		
	}// 등수 구하는 메스드 끝
	

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student4("홍길동",1,3,100,100,100));
		list.add(new Student4("남궁성",1,1,90,70,80));
		list.add(new Student4("김잣바",1,2,80,80,90));
		list.add(new Student4("이자바",2,1,70,90,70));
		list.add(new Student4("안자바",2,2,60,100,80));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

class Student4 implements Comparable<Student4>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total; //총점
	int schoolRank; // 전교등수
	
	@Override
	public int compareTo(Student4 o) {
		return (this.total - o.total)*(-1);
	}

	public Student4(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name 
				+", "+ban
				+", "+no
				+", "+kor
				+", "+eng
				+", "+math
				+", "+getTotal()
				+", "+getAverage()
				+", "+schoolRank; // 등수 추가 
		
	}
	
}