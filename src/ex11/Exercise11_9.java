package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Exercise11_9 {
	
	//������ϴ� �޼���
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		
		for(int i = 0; i < list.size(); i++) {
			Student5 s = (Student5)list.get(i);
			
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = i + 1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}//for
	}//������ϴ� �޼���
	
	//�ݺ��� ��� ���ϴ� �޼���
	public static void calculateClassRank(List list) {
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		
		for(int i = 0, n=0; i < list.size(); i++, n++) {
			Student5 s = (Student5)list.get(i);
			if(s.ban != prevBan) {
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			if(s.total == prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = n +1;
			}
			
			prevBan = s.ban;
			prevTotal = s.total;
			prevRank = s.classRank;
		}
		
	}//�ݺ��� ��� ���ϴ� �޼���
	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student5("ȫ�浿",1,3,100,100,100));
		list.add(new Student5("���ü�",1,1,90,70,80));
		list.add(new Student5("�����",1,2,80,80,90));
		list.add(new Student5("���ڹ�",2,1,70,90,70));
		list.add(new Student5("���ڹ�",2,2,60,100,80));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}


//�� ���� ����
class ClassTotalComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int result = -1;
		//������ �������� �������� ��������
		if(o1 instanceof Student5 && o2 instanceof Student5) {
			Student5 s1 = (Student5)o1;
			Student5 s2 = (Student5)o2;
			
			result = s1.ban - s2.ban;
			
			if(result == 0)
				result = s2.total - s2.total;
		}
		return result;
	}
	
} //�� ���� ���� ��


class Student5 implements Comparable<Student5>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total; //����
	int schoolRank; // �������
	int classRank; //�ݵ��
	
	
	@Override
	public int compareTo(Student5 o) {
		return (this.total - o.total)*(-1);
	}

	public Student5(String name, int ban, int no, int kor, int eng, int math) {
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
				+", "+schoolRank // ��� �߰� 
				+", "+classRank;
		
	}
	
}