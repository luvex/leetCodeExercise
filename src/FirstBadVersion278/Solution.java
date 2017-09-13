package FirstBadVersion278;

public class Solution
{
	boolean[] versions;

	public Solution(boolean[] _versions)
	{
		// TODO Auto-generated constructor stub
		this.versions = _versions;
	}

	public int firstBadVersion(int n)
	{
		int x = 1;
		int y = n;
		while (true)
		{
			if (divide(x, y))
			{
				if (y - x <= 1)
					return x;
				y = x + (y - x) / 2;
			}
			else
			{
				if (y - x <= 1)
					return y;
				x = x + (y - x) / 2;
			}
		}
	}

	public boolean divide(int i, int j)
	{
		if (isBadVersion(i + (j - i) / 2))
			return true;
		else
			return false;
	}

	public boolean isBadVersion(int i)
	{
		return this.versions[i - 1];
	}

	public static void main(String[] args)
	{
		boolean[] versions = new boolean[2126753390];
		for (int i = 0; i < 2126753390; i++)
		{
			if (i < 1702766718)
				versions[i] = false;
			else
				versions[i] = true;
		}
		Solution s = new Solution(versions);
		System.out.println(s.firstBadVersion(versions.length));
	}
}
