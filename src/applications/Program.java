package applications;

import java.util.Scanner;

import model.service.ReaderFileService;

import model.service.WriterFileService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int optionMenu = 0;
		System.out.println("Escolha uma das opções: ");
		System.out.printf("1 - Escrever no arquivo%n2 - Ler arquivo");
		do {
			optionMenu = sc.nextInt();
			switch (optionMenu) {
			case 1: {
				WriterFileService.writerFile();
			}
				break;

			case 2: {
				ReaderFileService.readerFile();

			}
				break;
			default:
				System.out.println("---------------------------------------------------------");
				System.out.println("Opção: " + optionMenu + " é invalida, tente novamente");
				System.out.println("---------------------------------------------------------");
			}

		} while (optionMenu != 1 && optionMenu != 2);
		

		sc.close();
	}

}
