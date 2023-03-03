package model.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public interface WriterFileService {

	static void writerFile() {
		String path = "C:\\Users\\MAYK\\Desktop\\Pasta para testes JAVA\\Usuarios1.txt.txt";
		String[] lines = UserGeneratorService.userGenerator();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
