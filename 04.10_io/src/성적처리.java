import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ����ó�� {
	static ArrayList<����> ������=new ArrayList<>();
	
	public static void main(String[] args) {
		//���� ��������
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//���� ��������
			BufferedReader br = new BufferedReader(fr);
			//�ݺ�, ���� ����
			String line;
			while(( line = br.readLine())!= null) {
				StringTokenizer st=new StringTokenizer(line,"\t");
				//�� ��ü ���� ����
				���� new����= new ����();
				new����.setName(st.nextToken());
				new����.setAddress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken()));
				new����.setEnglish(Double.parseDouble(st.nextToken()));
				//����Ʈ�� �������  �� ��ü ����
				������.add(new����);
				//����Ʈ �������
				
			}
			for(���� a: ������) {
				System.out.println(a);
			}
			//���Ϸ� ��������
			//���Ͽ�������
			FileWriter fw=new FileWriter("src/save.txt");
			//���ۿ�������
			BufferedWriter bw=new BufferedWriter(fw);
			//����
			for(���� a:������) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getMath()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getTotal()+"\t"+a.getAverage());
				
			}
			//����
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
