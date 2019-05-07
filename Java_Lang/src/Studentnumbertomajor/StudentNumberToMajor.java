package Studentnumbertomajor;

import java.util.Scanner;
public class StudentNumberToMajor {
	
	
	//학번을 입력받자, 학과를 출력하자.
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String[] grade3= {"인터렉티브 미디어과","인터렉티브 미디어과","뉴 미디어 디자인","뉴 미디어 디자인","뉴 미디어 솔루션","뉴 미디어 솔루션"};
		 String[] grade2= {"뉴 미디어 소프트웨어","뉴 미디어 소프트웨어","뉴 미디어 솔루션","뉴 미디어 솔루션","뉴 미디어 디자인","뉴 미디어 디자인"};
			System.out.println("학번을 입력하세요: ");
		String stn=sc.nextLine();
		
		if(stn.substring(0,1).equals ("3")) {
			
		if(stn.substring(1,2).contentEquals("1")
			||stn.substring(1,2).contentEquals("2")){
				System.out.println("인터렉티브 미디어");
		}else if(stn.substring(1,2).contentEquals("3")
			||stn.substring(1,2).contentEquals("4")) {
			System.out.println("뉴 미디어 디자인");
		}else if(stn.substring(1,2).contentEquals("5")
				||stn.substring(1,2).contentEquals("6")) {
			System.out.println("뉴 미디어 솔루션");
		}				
		}else {
			String classroomStr=stn.substring(1,2);
			int classroom=Integer.parseInt(classroomStr)-1;
			System.out.println(grade2[classroom]);
//			if(stn.substring(1,2).contentEquals("1")
//					||stn.substring(1,2).contentEquals("2")){
//						System.out.println("뉴 미디어 소프트웨어");
//				}else if(stn.substring(1,2).contentEquals("3")
//					||stn.substring(1,2).contentEquals("4")) {
//					System.out.println("뉴 미디어 솔루션");
//				}else if(stn.substring(1,2).contentEquals("5")
//						||stn.substring(1,2).contentEquals("6")) {
//					System.out.println("뉴 미디어 디자인");
//}
}

		}
}
