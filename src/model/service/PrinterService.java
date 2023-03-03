package model.service;

import java.util.List;

public interface PrinterService {

	public static void printList(List<?> list) {
		for (Object obj : list) {
	
			System.out.println(obj);
		}

	}

}
