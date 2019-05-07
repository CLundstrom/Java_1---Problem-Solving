package cl222ae_lab4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Histogram {

	private static final int TEST_LINES = 200;
	private static String fileName = "integer.dat"; // default value will be overwritten by program argument.
	private static File file;
	private static int[] histogram = new int[10];
	private static int outOfInterval;
	private static int inInterval;
	

	public static void main(String[] args) {
		if(args.length == 0) {
			System.err.println("No input argument found. Using default file.");
		}
		else {
			fileName = args[0];
		}

		System.out.println("File found: " + exists());

		createFile(); //generating test file.
		readFile();
		results();

	}

	private static void results() {
		String[] format = {"  0-10", " 10-20", " 20-30"," 30-40"," 40-50"," 50-60"," 60-70"," 70-80"," 80-90", "90-100"};
		
		System.out.println("Inside of interval [1-100]: " + inInterval);
		System.out.println("Outside of interval: " + outOfInterval);
		System.out.println("Histogram: ");

		// Printing designated intervals and stars.
		for (int i = 0; i < histogram.length; i++) {

			System.out.print(format[i] + "| ");

			for (int j = 0; j < histogram[i]; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static int getIntervalIndex(int a) {
		
		return a > 100 || a < 1 ? 10: (a-1)/10;
	}

	private static void generateHistogram(String nextLine) {

		int nextNumber = Integer.parseInt(nextLine);
		int index = getIntervalIndex(nextNumber);

		if (index < 10) {
			inInterval = inInterval + 1;
			histogram[index] = histogram[index] + 1;
		}

		else {
			outOfInterval = outOfInterval + 1;
		}
	}

	public static void readFile() {

		System.out.println("Reading from file: " + file.getAbsolutePath());
		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {

				generateHistogram(sc.nextLine());

			}
			sc.close();
		}

		catch (IOException e) {
			System.out.println(e.toString());
		}
		catch (Exception e) {

			System.out.println(e.toString());
		}
	}

	public static void createFile() {

		// Writing a random bunch of integers to a file.
		if (!exists()) {

			try {
				PrintWriter p = new PrintWriter(fileName);
				Random r = new Random();

				// Writing x lines to integer.dat
				for (int i = 0; i < TEST_LINES; i++) {
					p.println(r.nextInt(200));
				}
				p.close();
			}

			catch (IOException e) {

				System.out.println(e.toString());
			}
			
			catch (Exception e) {

				System.out.println(e.toString());
			}
			
		}
	}

	public static boolean exists() {

		file = new File(fileName);
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}
}
