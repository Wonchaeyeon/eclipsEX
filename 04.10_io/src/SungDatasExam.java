import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SungDatasExam {

	public static void main(String[] args) {
		//���� ��������(writed.txt)
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//���� ��������(readLine()�ϱ� ���ؼ�)
			BufferedReader br= new BufferedReader(fr);
			//�����а�, \t�� ��������
			String csvStr="";  //��� ����\t�� ������ String
			String tmpStr="";  //���� �б�� �ӽ� String
			while((tmpStr=br.readLine())!=null) {
				csvStr += tmpStr + "\t";
			}
			System.out.println(csvStr);
			//token���� ������ ������ ��������
			StringTokenizer parse=new StringTokenizer(csvStr,"\t");
			int length = parse.countTokens()/4;  //�� ��
			String[] name=new String[length];
			String[] address=new String[length];
			double[] math=new double[length];
			double[] english=new double[length];
			double[] total=new double[length];
			double[] avg=new double[length];
			
			for(int i=0;i<length; i++) {
				name[i]=parse.nextToken();
				address[i]=parse.nextToken();
				math[i]=Double.parseDouble(parse.nextToken());  //String�� double�� �ٲ���
				english[i]=Double.parseDouble(parse.nextToken());//String�� double�� �ٲ���
				//total,avg �������
				total[i]=math[i]+english[i];
				avg[i]=total[i]/2;
			}
			//�������
			//0~length����
			for(int i=0 ;i<length;i++) {
				System.out.println("�̸� : "+name[i]+",�ּ�: "+address[i]+", ����: "
			+math[i]+", ����: "+english[i]+", ����: "+total[i]+", ���: "+avg[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
