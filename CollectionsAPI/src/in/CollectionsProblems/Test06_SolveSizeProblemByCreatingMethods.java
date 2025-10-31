package in.CollectionsProblems;

public class Test06_SolveSizeProblemByCreatingMethods {
	private Object[] object = new Object[5];
	private int index = 0;

	// Add element method
	public void add(Object obj) {
		if (size() == capacity()) {
			incrementCapacity();
		}
		object[index] = obj;
		index++;
	}

	public int size() {
		return index;
	}

	public int capacity() {
		return object.length;
	}

	// Increase array size when full
	private void incrementCapacity() {
		Object[] newArray = new Object[object.length * 2]; // double the size
		for (int i = 0; i < object.length; i++) {
			newArray[i] = object[i];
		}
		object = newArray; // point old reference to new larger array
	}

	// Method to print elements
	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(object[i]);
		}
	}
}
