package laba2;
import java.io.*;
import static java.lang.System.out;
public class ����� {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		FileOutputStream file_O_Str2 = new FileOutputStream("D://eclipse//aa//foo.txt", true);//���� �������
		File file1 = new File("D://eclipse//aa//fo1.txt");//�� ����� ����� ����������
		File file2 = new File("D://eclipse//aa//foo.txt");//� ����� ��� �� ����, ��� ���������
		FileInputStream file_In_Str2  = new FileInputStream(file2);
		FileInputStream file_In_Str1  = new FileInputStream(file1);
		int K = (int) file2.length();
		int N = (int) file1.length();
		byte [] foo = new byte[K];
		byte [] fo1 = new byte[N];
		file_In_Str2.read(foo);
		file_In_Str1.read(fo1);
		file_O_Str2.write(fo1);		
		file_O_Str2.close();
		
		String t = new String(foo);
		String S = new String(fo1);
		
		out.println("�� ����� foo");
		out.println(t);
		out.println();
		out.println("�� ����� fo1");
		out.println(S);
	   }
}

