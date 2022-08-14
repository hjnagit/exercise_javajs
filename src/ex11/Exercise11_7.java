package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Exercise11_7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student3("»´±Êµø",1,3,100,100,100));
		list.add(new Student3("≥≤±√º∫",1,1,90,70,80));
		list.add(new Student3("±Ë¿„πŸ",1,2,80,80,90));
		list.add(new Student3("¿Ã¿⁄πŸ",2,1,70,90,70));
		list.add(new Student3("æ»¿⁄πŸ",2,2,60,100,80));
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

class BanNoAscending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student3 && o2 instanceof Student3) {
			Student3 s1 = (Student3)o1;
			Student3 s2 = (Student3)o2;
			
			if(s1.ban != s2.ban) {
				return s1.ban - s2.ban;
			}else
			return s1.no - s2.no;
			
		}
		
		return -1;
	}
}

class Student3 implements Comparable<Student3>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	@Override
	public int compareTo(Student3 o) {
		return this.name.compareTo(o.name);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student3(String name, int ban, int no, int kor, int eng, int math) {
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