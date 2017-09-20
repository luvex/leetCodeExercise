package MinStack155;

public class MinStack
{

	int[] data;
	int index;
	int size;

	/** initialize your data structure here. */
	public MinStack()
	{
		index = -1;
		size = 50;
		data = new int[size];
	}

	public void RebuildData()
	{
		size += 50;
		int[] data_temp = new int[size];
		for (int i = 0; i < data.length; i++)
			data_temp[i] = data[i];
		data = data_temp;
	}

	public void push(int x)
	{
		if (index + 1 >= size)
			RebuildData();
		data[++index] = x;
	}

	public void pop()
	{
		if (index >= 0)
		{
			index--;
		}
	}

	public int top()
	{
		return data[index];
	}

	public int getMin()
	{
		int x = 0;
		for (int i = 1; i <= index; i++)
		{
			if (data[i] < data[x])
				x = i;
		}
		return data[x];
	}

	public static void main(String[] args)
	{
		MinStack obj = new MinStack();
		obj.push(2);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */