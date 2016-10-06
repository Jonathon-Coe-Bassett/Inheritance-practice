
public abstract class Matter extends Reality
	{
		protected static String state;
		
		public static String getState()
			{
				return state;
			}

		public static void setState(String state)
			{
				Matter.state = state;
			}

		protected static String takesUpSpace()
		{
			return "the " + state + " " + name + " takes up space.";
		}
		
		protected static String solid()
		{
			return "solid";
		}
		protected static String liquid()
			{
				return "liquid";
			}
		protected static String gas()
			{
				return "gas";
			}
		protected static String plasma()
			{
				return "plasma";
			}
		@Override
		protected String move()
			{
				return "The " + name + " is acted upon by an outside force, and moves to the right.";
				
			}

	}
