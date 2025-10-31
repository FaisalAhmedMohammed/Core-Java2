package in.CollectionsProblems;

public class Test07_UserClassMainMethod {
	public static void main(String[] args) {
		Test06_SolveSizeProblemByCreatingMethods test = new Test06_SolveSizeProblemByCreatingMethods();

		test.add("a");
		test.add("b");
		test.add("c");
		test.add("d");
		test.add("e");
		test.add("f"); // this will trigger size increase automatically

		test.display(); // ✅ prints all stored elements
	}
}
