package Studentnumbertomajor;

import java.util.Scanner;
public class StudentNumberToMajor {
	
	
	//�й��� �Է¹���, �а��� �������.
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String[] grade3= {"���ͷ�Ƽ�� �̵���","���ͷ�Ƽ�� �̵���","�� �̵�� ������","�� �̵�� ������","�� �̵�� �ַ��","�� �̵�� �ַ��"};
		 String[] grade2= {"�� �̵�� ����Ʈ����","�� �̵�� ����Ʈ����","�� �̵�� �ַ��","�� �̵�� �ַ��","�� �̵�� ������","�� �̵�� ������"};
			System.out.println("�й��� �Է��ϼ���: ");
		String stn=sc.nextLine();
		
		if(stn.substring(0,1).equals ("3")) {
			
		if(stn.substring(1,2).contentEquals("1")
			||stn.substring(1,2).contentEquals("2")){
				System.out.println("���ͷ�Ƽ�� �̵��");
		}else if(stn.substring(1,2).contentEquals("3")
			||stn.substring(1,2).contentEquals("4")) {
			System.out.println("�� �̵�� ������");
		}else if(stn.substring(1,2).contentEquals("5")
				||stn.substring(1,2).contentEquals("6")) {
			System.out.println("�� �̵�� �ַ��");
		}				
		}else {
			String classroomStr=stn.substring(1,2);
			int classroom=Integer.parseInt(classroomStr)-1;
			System.out.println(grade2[classroom]);
//			if(stn.substring(1,2).contentEquals("1")
//					||stn.substring(1,2).contentEquals("2")){
//						System.out.println("�� �̵�� ����Ʈ����");
//				}else if(stn.substring(1,2).contentEquals("3")
//					||stn.substring(1,2).contentEquals("4")) {
//					System.out.println("�� �̵�� �ַ��");
//				}else if(stn.substring(1,2).contentEquals("5")
//						||stn.substring(1,2).contentEquals("6")) {
//					System.out.println("�� �̵�� ������");
//}
}

		}
}
