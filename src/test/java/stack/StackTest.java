package stack;

import org.junit.Test;

import com.stack.DataStruc;
import com.stack.Queue;
import com.stack.Stack;

public class StackTest {
	@Test
	public void Stack_push() {
		System.out.println("Stack Push");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstnodeadd);
		stack.push(secondnodeadd);
		stack.push(thirdnodeadd);
		stack.print();

	}

	@Test
	public void Stack_peak_pop() {
		System.out.println("Stack Peak and Pop");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstnodeadd);
		stack.push(secondnodeadd);
		stack.push(thirdnodeadd);
		stack.print();

		System.out.println("Peak is: " + stack.peak());
		stack.print();
		stack.pop();
		stack.print();

	}

	@Test
	public void Queue_enqueue() {
		System.out.println("Queue Enqueue");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(70);
		Queue queue = new Queue();
		queue.enqueue(firstnodeadd);
		queue.enqueue(secondnodeadd);
		queue.enqueue(thirdnodeadd);
		queue.print();

	}

	@Test
	public void Queue_dequeue() {
		System.out.println("Queue Dequeue");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(56);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(70);
		Queue queue = new Queue();
		queue.enqueue(firstnodeadd);
		queue.enqueue(secondnodeadd);
		queue.enqueue(thirdnodeadd);
		queue.print();
		queue.dequeue();
		queue.print();

	}
}