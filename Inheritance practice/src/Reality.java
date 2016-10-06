
public abstract class Reality
	{
		protected static String name;
		protected static int size;
		
		
		public static String getName()
			{
				return name;
			}
		public static void setName(String name)
			{
				Reality.name = name;
			}
		public static int getSize()
			{
				return size;
			}
		public static void setSize(int size)
			{
				Reality.size = size;
			}
		protected static String exist()
		{
			return name + " exists.";
		}
		protected abstract String move();
	}
