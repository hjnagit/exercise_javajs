package ex11;

import java.util.ArrayList;

public class Exercise11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();//교집합
		ArrayList cha = new ArrayList();//차집합
		ArrayList hap = new ArrayList();//합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		kyo.addAll(list1);
		kyo.retainAll(list2); // 겹치지 않는 것을 지운다 ->교집합
		
		cha.addAll(list1);
		cha.removeAll(list2); // 겹치는 것을 지운다 -> 차집합
		
		hap.addAll(list1);
		hap.removeAll(list2); // 겹치는 것을 지우고
		hap.addAll(list2); // 다시 넣는다 -> 합집합
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
		
	}

}
