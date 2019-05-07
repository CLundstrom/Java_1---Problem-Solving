package cl222ae_lab4.sorter_orter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class City implements Comparable<City> {

	private static File file = new File("cities.csv");
	private String name;
	private int zipCode;
	private static int nrOfCities = 0;
	
	
	public City(String name, int zipCode) {

		this.name = name;
		this.zipCode = zipCode;
	}

	public static void main(String[] args) {
		List<City> cities = readFile();
		System.out.println("Number of cities detected: " + nrOfCities);
		System.out.println("Unsorted: ");
		printCities(cities);
		System.out.println("\nSorted: ");
		Collections.sort(cities);
		printCities(cities);
	}

	public static List<City> readFile() {

		List<City> cities = new ArrayList<City>();

		System.out.println("Reading from file: " + file.getAbsolutePath());
		System.out.println();

		try {
			// Important that the file is encoded in "UTF-8" and not in "UTF-8-bom"
			// or such. Double check encoding of file in notepad++ or similar.
			Scanner sc = new Scanner(file, "UTF-8");

			while (sc.hasNextLine()) {
				nrOfCities++;
				String tmp = sc.nextLine();
				String[] separator = tmp.split(";");
				int zip = Integer.parseInt(separator[0]);
				City city = new City(separator[1], zip);
				cities.add(city);

			}
			sc.close();
		} catch (NumberFormatException e) {
			System.out.println("Wrong encoding format." + e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		return cities;
	}

	public static void printCities(List<City> cities) {

		for (City city : cities) {

			System.out.println(city.zipCode + " " + city.name);

		}
	}

	@Override
	public int compareTo(City ort) {

		if (this.zipCode > ort.zipCode) {

			return 1;
		} else if (this.zipCode < ort.zipCode) {
			return -1;
		} else {

			return 0;
		}
	}

}
