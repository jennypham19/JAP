package exam1Topic3;

public class Thread1 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
				Thread.sleep(100);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
