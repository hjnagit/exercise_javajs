package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_8 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ �����Ѵ�
		
		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();
		
		// list�� ����� ��ü�� �ϳ��� �д´�
		for(int i = 0; i<length; i++) {
			Student4 s = (Student4)list.get(i);
			// ������ �������� �������� ������ �߱⶧���� �����ȴ�
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i+1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		} //for
		
	}// ��� ���ϴ� �޽��� ��
	

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student4("ȫ�浿",1,3,100,100,100));
		list.add(new Student4("���ü�",1,1,90,70,80));
		list.add(new Student4("�����",1,2,80,80,90));
		list.add(new Student4("���ڹ�",2,1,70,90,70));
		list.add(new Student4("���ڹ�",2,2,60,100,80));
		
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
	
	int total; //����
	int schoolRank; // �������
	
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
				+", "+schoolRank; // ��� �߰� 
		
	}
	
}