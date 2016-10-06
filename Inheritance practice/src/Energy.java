
public abstract class Energy extends Reality
	{
		protected static boolean form;
		
		
		public static boolean isForm()
			{
				return form;
			}

		public static void setForm(boolean form)
			{
				Energy.form = form;
			}


		protected static String toggleForm(String name)
		{
			form=!form;
			return "The " + name + " changed form.";
			
		}

	}
