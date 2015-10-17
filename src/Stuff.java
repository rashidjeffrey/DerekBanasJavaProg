import org.apache.commons.lang3.SystemUtils;

public class Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		if (SystemUtils.IS_OS_LINUX) {
			System.out.println("Linux");

		} else {
			System.out.println("Not linux");
		}
	}

}
