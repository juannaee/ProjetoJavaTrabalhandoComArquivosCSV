package model.service;

import java.util.Scanner;

public class UserGeneratorService implements ConcatenatingStringService {

	public static String[] userGenerator() {

		Scanner sc = new Scanner(System.in);

		// Inicio-Variaveis
		String login;
		String password;
		String testPassword;
		Double salary;
		// Final-Variaveis

		System.out.println("Digite a quantidade de usuarios");
		int quantity = sc.nextInt();
		String[] vect = new String[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("Escreva login e senha");
			System.out.print("Login: ");
			sc.nextLine();
			login = sc.next();
			System.out.println();
			do {
				System.out.print("Senha: ");
				password = sc.next();
				System.out.print("Repita a senha: ");
				testPassword = sc.next();

			} while (verificationPassword(password, testPassword) == false);

			System.out.print("Salario: ");
			salary = sc.nextDouble();

			vect[i] = ConcatenatingStringService.concatenatingString(login, testPassword, salary);

		}
		sc.close();

		return vect;

	}

	public static boolean verificationPassword(String password, String testPassword) {

		if (!password.equals(testPassword)) {
			System.out.println("Senhas erradas tente novamente");
			return false;
		}

		return true;

	}

}
