package Lec23;

public class Stack_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);// O(1)
		st.push(20);
		st.push(7);
		st.push(5);
		st.push(3);
		st.push(9);
		st.Display();
	}
}
