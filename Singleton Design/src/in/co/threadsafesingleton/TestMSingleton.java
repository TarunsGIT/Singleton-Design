package in.co.threadsafesingleton;

public class TestMSingleton {

	public static void main(String[] args) {
		MSingleton ins = MSingleton.getInstance();
		System.out.println("INSTANCE ONE:");
		System.out.println(ins);
		System.out.println(ins.hashCode());
		MSingleton inss = MSingleton.getInstance();
		System.out.println("INSTANCE TWO:");
		System.out.println(inss);
		System.out.println(inss.hashCode());
		
		
	}

}
