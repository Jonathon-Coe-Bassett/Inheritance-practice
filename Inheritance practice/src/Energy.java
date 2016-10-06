
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


		protected String toggleForm()
		{
			form=!form;
			return "The " + name + " Changed form.";
			
		}

	}
