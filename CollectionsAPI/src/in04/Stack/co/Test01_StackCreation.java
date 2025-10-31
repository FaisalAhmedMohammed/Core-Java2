package in04.Stack.co;

import java.util.Iterator;
import java.util.Stack;

import in03.Vector.co.Student;

public class Test01_StackCreation {
	public static void main(String[] args) {

		Stack<Object> stk = new Stack<Object>();

		System.out.println(stk.size());
		System.out.println(stk);
		stk.push("a");
		stk.push("b");

		stk.push("a");
		stk.push("b");

		stk.push('p');
		stk.push(true);
		stk.push(null);
		stk.push(null);
		stk.push(new Student(1, 9));
		stk.push(new Student(123, 9));

		System.out.println(stk.size());
		System.out.println();

		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.peek());

		System.out.println(stk.pop());

		System.out.println(stk.size());

		System.out.println(stk.empty());

		System.out.println();

		Iterator<Object> en = stk.iterator();
		while (en.hasNext()) {
			Object object = (Object) en.next();
			System.out.print(object + " , ");
		}
		System.out.println();
		System.out.println("*".repeat(50));
		System.out.println(stk.get(0));

	}

}
