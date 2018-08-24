package model;

public class Test {
	public static void main(String[] args) {
		Model test = new Model();
		// the test should print "Deny access." in the following example.
		// you can add more test cases.
		test.translatePolicy(test.getPolicy(true, true, false, false));
	}
}
