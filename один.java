package laba2;
import java.io.*;
import java.util.Scanner;
public class один {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		File file = new File("E://PSTU//laba2_oborpr/", "txt.txt");
		try (FileInputStream reader = new FileInputStream(file)) {
			int N = (int) file.length();
			byte[] data = new byte[N];
			reader.read(data);
			String S = new String(data);
			String[] words = S.split("\\s");
			for (String word : words) {
				int Letter = 0;
				int Temp = 0;
				char[] result = word.toCharArray();
				for (char c : result) {
					Temp++;
					if (Character.isUpperCase(c)) Letter++;
					}
				if (Letter == Temp){
					System.out.println(word);
				}
			}
		}
	}
}

