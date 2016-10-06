
public class Life extends Matter
	{
		protected static boolean alive;
		
		public Life(String n, int s, String st, boolean a)
		{
			name=n;
			size=s;
			state=st;
			alive=a;
		}
		


		public static void setAlive(boolean alive)
			{
				Life.alive = alive;
			}



		protected static String isAlive()
		{
			return "The " + name + " is alive!";
		}

		@Override
		protected String move()
			{
				return "The " + name + " moves itself to the left in search of food.";
				
			}
	}
