package week1.day5.assignment4.my_pack;

public class VariableStack implements Stack {
	int[] backingArray;
	int length;
	int max_size;
	
	public VariableStack (int length) {
		backingArray = new int[length];
		this.length = 0;
		this.max_size = length;
	}

	@Override
	public void push(int i) {
		if (this.length > max_size) {
			int[] newBackingArray = new int[max_size * 2];
			for (int j = 0; j < length; i++)
				newBackingArray[j] = backingArray[j];
		}
		backingArray[length] = i;
		length++;
	}

	@Override
	public int pop() {
		length--;
		return backingArray[length]; // Note length has been reduced already here
	}
}
