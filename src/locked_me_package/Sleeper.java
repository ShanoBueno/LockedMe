package locked_me_package;

public class Sleeper {
	void sleeps() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}
