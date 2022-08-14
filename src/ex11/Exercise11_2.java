package ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); // 중복만 제거
		TreeSet tset = new TreeSet(list); // 정렬
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while(!stack.empty())
			System.out.println(stack.pop()); // 스택에서 값 꺼내기 -순서 거꾸로
		
	}

}
