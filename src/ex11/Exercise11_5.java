package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("È«±æµ¿",1,1,100,100,100));
		list.add(new Student("³²±Ã¼º",1,2,90,70,80));
		list.add(new Student("±èÀã¹Ù",1,3,80,80,90));
		list.add(new Student("ÀÌÀÚ»ğ",1,4,70,90,70));
		list.add(new Student("¾ÈÀÚ¹Ù",1,5,60,100,80));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
	}

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name + ", "+ban+", "+no+", "+kor+", " +eng+", "+math+", "+getTotal()+", "+ getAverage(); 
	}
	
}