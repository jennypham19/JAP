package exam1Topic3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a program to demonstrating the using of HashMap
//a. Accept the phone and name of 10 students from keyboard, store the details into HashMap 
//b. The program will be loop until the accepted value is "x" or "X". After that, print the students list on the screen. 
public class Exam1 {

	public static void main(String[] args) {
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		String name = null;
		int phone;
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Ten sinh vien: ");
				name = sc.nextLine();
				System.out.print("So dien thoai: ");
				phone = sc.nextInt();
				sc.nextLine();
				if (name.equalsIgnoreCase("x")) {
					break;
				}else {
					list.put(name, phone);
				}
			}
			sc.close();
			System.out.println("Danh sach la: ");
			for (Map.Entry<String, Integer> m : list.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
