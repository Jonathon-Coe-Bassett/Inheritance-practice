 import java.util.ArrayList;
public class RealityRunner
	{
		private static ArrayList<Reality> things=new ArrayList<Reality>();

		public static void main(String[] args)
			{
				things.add(new Object("Book", 1, Matter.solid(), false));
				things.add(new Life("Coe", 10, "alive", true));
				things.add(new ElectromagneticEnergy("Light from the computer screen", 1, false, 400.1));
				things.add(new ThermalEnergy("Body heat from Coe", 1, false, 310));
				
				System.out.println(Reality.exist(things.get(0).getName()));
				System.out.println(Energy.toggleForm(things.get(0).getName()));
				System.out.println(ThermalEnergy.isTemp(things.get(0).getName(), things.get(0).getTempKelvin()));
				
			}

	}
