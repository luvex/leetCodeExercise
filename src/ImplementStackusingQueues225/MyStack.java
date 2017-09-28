package ImplementStackusingQueues225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack
{
	Queue<Integer> queue;

	/** Initialize your data structure here. */
	public MyStack()
	{
		queue = new LinkedList<Integer>();
	}

	/** Push element x onto stack. */
	public void push(int x)
	{
		queue.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop()
	{
		for (int i = 0; i < queue.size() - 1; i++)
		{
			queue.add(queue.poll());
		}
		return queue.poll();
	}

	/** Get the top element. */
	public int top()
	{
		int temp = 0;
		for (int i = 0; i < queue.size(); i++)
		{
			temp = queue.poll();
			queue.add(temp);
		}
		return temp;
	}

	/** Returns whether the stack is empty. */
	public boolean empty()
	{
		return queue.isEmpty();
	}
}
