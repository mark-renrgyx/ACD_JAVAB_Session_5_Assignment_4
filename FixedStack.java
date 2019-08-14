package week1.day5.assignment4.my_pack;

public class FixedStack implements Stack {
	
	int[] backingArray;
	int length;
	
	public FixedStack (int length) {
		backingArray = new int[length];
		this.length = 0;
	}

	@Override
	public void push(int i) {
		backingArray[length] = i;
		length++;
	}

	@Override
	public int pop() {
		length--;
		return backingArray[length]; // Note length has been reduced already here
	}
}
