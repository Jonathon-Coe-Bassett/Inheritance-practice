
public class ThermalEnergy extends Energy
	{
		protected static int tempKelvin;
		
		public ThermalEnergy(String n, int s, boolean f, int t)
		{
			name=n;
			size=s;
			form=f;
			tempKelvin=t;
		}
		
		
		public static int getTempKelvin()
			{
				return tempKelvin;
			}


		public static void setTempKelvin(int tempKelvin)
			{
				ThermalEnergy.tempKelvin = tempKelvin;
			}


		protected static String isTemp(String name, int tempKelvin)
		{
			return "The " + name + " is " + tempKelvin + " Kelvin";
		}

		@Override
		protected String move()
			{
				return name + " radiates";
			}
	}
