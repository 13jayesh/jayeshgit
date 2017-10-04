public class wind
{

		public static void windChill(double temp, double windspeed) {
		double a, b, c, windchil = 0; // double variables to store calculations
		if (temp <= 50 && (windspeed <= 120 && windspeed >= 3)) {
			a = (35.74 + 0.6215); // stores addition of double values
			b = ((0.4275 * temp) - 35.75);
			/*
			 * Math.pow is mathematical function in lang package for taking
			 * power of given number
			 */
			c = Math.pow(windspeed, 0.16); // (v,0.16) 0. is raise to power of v
											// and stored in v variable
			windchil = (a + (b * c));
		}
		System.out.println("windspeed =" + windspeed + "\ntemperature =" + temp + "\nWind Chill=" + windchil);
}

public static void main(String args[])
{
		double windspeed =Double.parseDouble(args[0]);
		double temp =Double.parseDouble(args[0]);
		windChill(temp,windspeed);
	}


 }
