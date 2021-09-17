package laba2;
import java.io.*;
public class два {
	public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("E://PSTU//laba2_oborpr/txt.txt"))) {
            long[] unicodeArray = new long[65536];

            while (reader.ready()) {
                char[] charArray = reader.readLine().toCharArray();
                for (char c : charArray) {
                    unicodeArray[(int) c]++;
                }
            }

            for (int i = 0; i < unicodeArray.length; i++) {
                if (unicodeArray[i] > 0) {
                    System.out.println("Symbol: " + (char) i + " Freq: " + unicodeArray[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

