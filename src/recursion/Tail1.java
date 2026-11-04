package recursion;

public class Tail1
	{

		public static void main(String[] args)
			{
				System.out.println(mystery(5));
				System.out.println(trace(3));

			}

		public static int mystery(int n)
			{
				if (n == 1)
					return 1;
				else
					return n + mystery (n-2);
			}
		public static int trace(int n)
			{
			if (n > 5)
				return 1;								
			else
				return n - trace(n  + 1);
			}

	}
