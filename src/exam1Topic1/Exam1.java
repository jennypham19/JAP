package exam1Topic1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//Write a program to accept book details(code, title, author, price) from command line
// a. Write book details into character file "Book.txt" in appending mode
// b. After writing file, read the file and show on the screen.
public class Exam1 {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap n: ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print("Code: ");
				int code = sc.nextInt();
				System.out.print("Title: ");
				String title = sc.nextLine();
				sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				System.out.print("Price: ");
				float price = sc.nextFloat();
				Book book = new Book(code, title, author, price);
				list.add(book);
			}
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		File file = new File("D:\\java\\Book.txt");
		try {
			if (!file.exists()) {
				if (!file.createNewFile()) {
					throw new Exception("Có lỗi xảy ra");
				}
			} else {
				if (file.canWrite()) {
					System.out.println("Được phép ghi");
					FileWriter m = new FileWriter(file, true);
					for (Book book : list) {
						m.write(book + System.lineSeparator());
					}
					m.close();
					try {
						FileOutputStream fos = new FileOutputStream(file);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(list);
						oos.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("Không được phép ghi");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try{
//            FileInputStream readData = new FileInputStream(file);
//            ObjectInputStream readStream = new ObjectInputStream(readData);
//
//            ArrayList lits = (ArrayList<Book>) readStream.readObject();
//            readStream.close();
//
//            System.out.println(lits.toString());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

	}
}
