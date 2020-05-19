package org.mwage.math.core_components.algebra;
import static org.mwage.math.core_components.algebra.Util_Integer.*;
public class Test {
	public static void main(String[] args) {
		System.out.println(add("99999999999999999999999999999999999", "1", "9"));
		System.out.println(add("1", "1"));
		System.out.println(add("1234567890", "0123456789"));
		System.out.println(add("1234567890"));
		System.out.println(mut("1", "2"));
		System.out.println(mut("6589468395049855909356", "32752849482", "67876543985792", "527945780499090"));
		System.out.println(mut("1", "2", "3", "4"));
		System.out.println(mut("1", "2", "3", "4", "0"));
	}
}