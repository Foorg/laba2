package laba2;
import java.io.*;
import static java.lang.System.out;
public class шесть {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		FileOutputStream file_O_Str2 = new FileOutputStream("D://eclipse//aa//foo.txt", true);///сюда запишет
		File file1 = new File("D://eclipse//aa//fo1.txt");//из этого будет записывать
		File file2 = new File("D://eclipse//aa//foo.txt");//в файле что то есть, оно останется
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
		
		out.println("из файла foo");
		out.println(t);
		out.println();
		out.println("из файла fo1");
		out.println(S);
	   }
}

