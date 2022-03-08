package classloaders;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Demo {

	public static void main(String[] args) {
		System.out.println("loader of current class "+Demo.class.getClassLoader());
		System.out.println("loader of Logging class "+Logger.class.getClassLoader());
		System.out.println("loader of ArrayList class "+ArrayList.class.getClassLoader());
	}
}
