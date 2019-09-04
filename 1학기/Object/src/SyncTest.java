              
public class SyncTest {
	private int sum=0;
	private int num=0;
	
	public synchronized void IncreaseNumber() {   //함수 내에서 동시작업을 해도 끊어지지 않음
		num++;   //num=num+1과 같음
		sum = sum + num;
	}
	public void IncreaseNumber2() {   //synchronized를 안에서 실행, 
		
		synchronized (this) {
			num++;
		}
		sum = sum + num;
		
	}
	public static void main(String[] args) {
		
	}
}
