
public class Object extends Matter
	{
		protected static boolean moved;
		
		public Object(String n, int s, String st, boolean m)
		{
			name=n;
			size=s;
			state=st;
			moved=m;
		}

		public static boolean isMoved()
			{
				return moved;
			}

		public static void setMoved(boolean moved)
			{
				Object.moved = moved;
			}
		protected static String staysPut()
		{
			return "The " + name + " Stays put.";
		}
	}
