import java.io.IOException;
import java.io.InputStream;

public class p154_Echo2Exam {

	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		while(true) {
			int i =is.read();
			if(i==-1) {
				break;
			}
			System.out.println((char)i);
		}

	}

}
