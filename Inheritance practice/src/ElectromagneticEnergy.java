
public class ElectromagneticEnergy extends Energy
	{
		protected static double wavelength;
		
		public ElectromagneticEnergy(String n, int s, boolean f, double w)
		{
			name=n;
			size=s;
			form=f;
			wavelength=w;
		}
		
	public static double getWavelength()
			{
				return wavelength;
			}


		public static void setWavelength(double wavelength)
			{
				ElectromagneticEnergy.wavelength = wavelength;
			}


	@Override
	protected String move()
		{
			return "The " + name + " moves at lightspeed.";
			
		}
		
	}
