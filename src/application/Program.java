package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInt = Arrays.asList(5, 2, 3, 10);
		List<String> myStr = Arrays.asList("Julia", "Livia", "Calebe");
		
		
		printList(myStr);
		printList(myInt);
	}

	public static void printList(List<?> list) {//lista generica tipo curinga
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
