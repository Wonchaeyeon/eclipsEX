import java.util.*;

public class ClassArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] 반4 = { "강은서", "곽가연", "김민지", "김봄이", "김소현", "김채민", "남정윤", "박서연", "서혜림", "신채린", "양수빈", "엄하늘", "원채연",
				"윤수빈", "임태희", "전은정", "정유경", "함지현" };

//		for(int i=0;i<반4.length;i++) { 
//			System.out.println(반4[i]);
//		}
		for(String name:반4) {//for-each문  (오른쪽에 내용을 담을 변수:꺼내올 변수들)
			System.out.println(name);
		}
		
		
//		System.out.println("번호를 입력하세요. 이름을 알려드립니다.");
//		while (true) {//for(;;)이거랑 while(true)랑 같음
//			int number = sc.nextInt();
//			// 1<=number<=18
//			if (1 <= number && number <= 반4.length) {
//				System.out.println(반4[number - 1]);
//			} else {
//				break;
//			}
//		}
	}
}
