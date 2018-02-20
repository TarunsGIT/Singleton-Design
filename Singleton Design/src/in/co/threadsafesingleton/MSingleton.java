package in.co.threadsafesingleton;

public final class MSingleton  {// FINAL CLASS OPTIONAL

	private static MSingleton instance;// PRIVATE STATIC 
	private static Object mutex = new Object();// MUTEX OBJECT

	private MSingleton() {// PRIVATE DEFAULT CONSTRUCTOR

	}

	public static MSingleton getInstance() {
		MSingleton result = instance;
		if (result == null) {

			synchronized (mutex) {
				result = instance;
				if (result == null) {
					instance = result = new MSingleton();
				}
			}

		}
		return result;
	}

}
