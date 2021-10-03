package exam1Topic3;

//Using the Muti-Threading, do the following program
// Create 2 thread: Thread 1 and Thread 2
// Thread 1: print even number (so chan) from 0 to 100
// Thread 2: print odd number (so le) from 1 to 99
// When program is executed, the program will be shown as belong  
public class Exam2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread1();
		Thread thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}
}
