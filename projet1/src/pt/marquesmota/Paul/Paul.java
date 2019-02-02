package pt.marquesmota.Paul;

import java.util.Scanner;

public class Paul {

	public static void main(String[] args) {
		String reponse = new String();
		int conversion;
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.println("Convertisseur de degrés Celsius et Farenheit");
				System.out.println("--------------------------------------------");
				System.out.println("Choisissez le mode de conversion :");
				System.out.println("1 : Convertisseur Celsius - Farenheit");
				System.out.println("2 : Convertisseur Farenheit - Celsius");

				conversion = sc.nextInt();
			} while (!(conversion == 1 || conversion == 2));

			System.out.println("Température à convertir : ");
			double temperature = sc.nextDouble();

			if (conversion == 1) {
				double farenheit = temperature * 9 / 5 + 32;
				System.out.println(temperature + "°C correspond à : " + arrondi(farenheit,2) + "°F");
			} else {
				double celsius = (temperature - 32) * 5 / 9;
				System.out.println(temperature + "°F correspond à : " + arrondi(celsius,2) + "°C");
			}

			System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
			reponse = sc.next();
		} while (reponse.charAt(0) == 'O');
	}

	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
