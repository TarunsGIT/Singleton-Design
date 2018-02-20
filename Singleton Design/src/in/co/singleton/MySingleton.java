package in.co.singleton;

public final class MySingleton {

	private MySingleton() {

	}

	private static MySingleton instance = null;

	public static MySingleton getInstance() {

		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;

	}

}
