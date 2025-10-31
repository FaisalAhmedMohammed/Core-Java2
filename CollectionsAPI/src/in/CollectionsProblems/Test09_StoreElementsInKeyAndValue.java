package in.CollectionsProblems;

public class Test09_StoreElementsInKeyAndValue {

	private String[] keys = new String[5];
	private String[] values = new String[5];
	int index = 0;

	public void add(String key, String value) {
		if (size() == capacity()) {
			grow();
		}
		keys[index] = key;
		values[index] = value;
		index++;

	}

	private void grow() {
		int newCapacity = keys.length * 2;
		String[] newKey = new String[newCapacity];
		String[] newValue = new String[newCapacity];

		for (int i = 0; i < keys.length; i++) {
			newKey[i] = keys[i];
			newValue[i] = values[i];
		}
		keys = newKey;
		values = newValue;

	}

	public void dispay() {
		for (int i = 0; i < index; i++) {
			System.out.println(keys[i] + "\t" + values[i]);
		}
	}

	public int size() {
		return index;
	}

	public int capacity() {
		return keys.length;
	}

	public static void main(String[] args) {
		Test09_StoreElementsInKeyAndValue obj = new Test09_StoreElementsInKeyAndValue();
		obj.add("empno", "7754");
		obj.add("name", "ashok");
		obj.add("sal", "50000");
		obj.add("dept", "backend");

		obj.dispay();
	}
}
