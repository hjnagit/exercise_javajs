package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Excercise11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int [5][5];
		
		for(int i = 0; set.size()<25; i++) {
			set.add((int)(Math.random()*30)+1+"");
		}
		
		//저장 순서를 유지하는 list에 넣어준다
		ArrayList list = new ArrayList(set);
		//list 섞어주기
		Collections.shuffle(list);
		
		Iterator it = list.iterator();
		
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
		
		
		
	}//main

}
