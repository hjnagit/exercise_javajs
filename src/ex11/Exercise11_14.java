package ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
	
	static ArrayList record = new ArrayList(); // ���������͸� ������ ����
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			switch(displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: displayRecord();
				break;
			case 3: 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}//while(true)
	}
	
	//menu�� �����ִ� �޼��� displayMenu
	static int displayMenu() {
		System.out.println("**********�������� ���α׷�**********");
		System.out.println();
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� ����");
		System.out.println();
		System.out.println("3. ���α׷� ����");
		System.out.println();
		System.out.println("���ϴ� �޹¸� �����ϼ���.(1~3)");
		
		int menu = 0;
		
//		while(true) {
//			menu = sc.nextInt();
//			if(menu==1||menu==2||menu==3) {
//				break;
//			}
//			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
//			System.out.println("���ϴ� �޴��� �����ϼ���. (1~3) : ");
//		}
		
		do {
			try {
				menu = Integer.parseInt(sc.nextLine().trim());
				
				if(1<=menu && menu<=3) {
					break;
				}else {
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println("���ϴ� �޴��� �����ϼ���. (1~3) : ");
			}
		}while(true);
		
		return menu;
	}//menu�� �����ִ� �޼��� displayMenu
	
	
	//�����͸� �Է¹޴� �޼��� inputRecord()
	static void inputRecord() {
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("[�̸�,��,��ȣ,�����,�����,���м���]�� "
				+ "������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		
		while(true) {
			System.out.println(">>");
			try {
				String input = sc.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")) {
					Scanner sc2 = new Scanner(input).useDelimiter(",");
					record.add(new Student6(sc2.next(),sc2.nextInt(),sc2.nextInt(),sc2.nextInt(),sc2.nextInt(),sc2.nextInt()));
					System.out.println("���ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
				}else {
					// �Է°��� q�� �޼��� ����
					return;
				}
			} catch(Exception e){
				e.printStackTrace();
				System.out.println("�Է¿����Դϴ�. �̸�,��,��ȣ,�����,�����,���м����� "
						+ "������ �Է��ϼ���.");
			}
			
		}//end of while
	}//�����͸� �Է¹޴� �޼��� inputRecord()
	
	
	//������ ����� �����ִ� �޼��� displayRecord
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if(length > 0) {
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("=====================================================");
			
			for(int i=0; i<length; i++) {
				Student6 student = (Student6)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			
			System.out.println("=====================================================");
			System.out.println("���� : " + koreanTotal + " " + englishTotal + 
					" " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("=====================================================");
			System.out.println("�����Ͱ� �����ϴ�");
			System.out.println("=====================================================");
		}	
	}//������ ����� �����ִ� �޼��� displayRecord

}



//Student6Ŭ����
class Student6 implements Comparable<Student6>{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total; //����
	int schoolRank; // �������
	int classRank; //�ݵ��
	
	
	@Override
	public int compareTo(Student6 o) {
		return (this.total - o.total)*(-1);
	}

	public Student6(String name, int ban, int no, int kor, int eng, int math) {
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
	
}//Student6 Ŭ����