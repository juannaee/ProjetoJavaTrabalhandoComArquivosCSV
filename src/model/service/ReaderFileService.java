package model.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Users;

public interface ReaderFileService {

	static void readerFile() {

		String path = "C:\\Users\\MAYK\\Desktop\\Pasta para testes JAVA\\Usuarios1.txt.txt";

		List<Users> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] lines = line.split(",");
				list.add(new Users(lines[0], lines[1], Double.parseDouble(lines[2])));
				line = br.readLine();

			}

			Collections.sort(list);
			PrinterService.printList(list);
			System.out.println("Salario mais alto: " + ProcessingReportService.biggestSalary(list));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
