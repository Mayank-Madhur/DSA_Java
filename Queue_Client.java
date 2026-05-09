package Lec23;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new  Queue();
		q.Enqueue(10);
		q.Enqueue(5);
		q.Enqueue(7);
		q.Enqueue(9);
		q.Enqueue(15);
		System.out.println(q.getFront());
		System.out.println(q.Dequeue());
	
	}

}
