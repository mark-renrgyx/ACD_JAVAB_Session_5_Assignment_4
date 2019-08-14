package week1.day5.assignment4.my_pack;

public class StacksMain {

	public static void main(String[] args) {
		Stack fixed = new FixedStack(5);
		fixed.push(1);
		System.out.println(fixed.pop());
		fixed.push(1);
		
		fixed.push(2);
		System.out.println(fixed.pop());
		fixed.push(2);
		
		fixed.push(3);
		System.out.println(fixed.pop());
		fixed.push(3);
		
		fixed.push(4);
		System.out.println(fixed.pop());
		
		Stack vari = new VariableStack(5);
		vari.push(1);
		System.out.println(vari.pop());
		vari.push(1);
		
		vari.push(2);
		System.out.println(vari.pop());
		vari.push(2);
		
		vari.push(3);
		System.out.println(vari.pop());
		vari.push(3);
		
		vari.push(4);
		System.out.println(vari.pop());
	}
}
