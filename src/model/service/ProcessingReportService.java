package model.service;

import java.util.List;

public class ProcessingReportService {

	public static <T extends Comparable<T>> T biggestSalary(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}

		T biggestSalary = list.get(0);

		for (T item : list) {
			if (item.compareTo(biggestSalary) > 0) {
				biggestSalary = item;
			}
		}

		return biggestSalary;

	}

}
