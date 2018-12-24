import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFiles {

	static Scanner scanner = new Scanner(System.in);
	static BufferedReader br = null;
	static String line;

	public static void main(String[] args) {

		System.out.println("Please enter the file name to be read ...");

		try {

			br = new BufferedReader(new FileReader("C:\\Users\\arsin\\Desktop\\" + scanner.next()));

		} catch (FileNotFoundException e) {

			System.out.println("The file has not found ..." + e.getMessage());

			System.exit(0);
		}

		try {

			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}
		} catch (Exception e) {

			System.out.println("No text can be read in side the file..." + e);
			
		}
		finally {
			System.exit(0);
		}
	}
	
}
