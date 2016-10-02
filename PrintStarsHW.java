/** 
 * this program prints stars in rows to make 
 * the shape of two triangles 
 * @author Darlene Fung
 */

public class PrintStarsHW
{

	public static void main(String[] args)
	{
		rightSideUpTriangle();
		upsideDownTriangle();
	}

	/** 
	 * this method prints stars to make a right-side up triangle 
	 */
	public static void rightSideUpTriangle()
	{
		int n = 4; 
		int counter = 0;
		while (counter < n)
		{	
			String PrintString = "*";
			int StarCounter = 1;
			while (StarCounter <= counter)
			{
				PrintString += "*";
				StarCounter ++;
			}
			
			System.out.println(PrintString);
			counter ++;
		}
	
	}
	
	/**
	 * this method prints stars to make a upside-down triangle
	 */
	public static void upsideDownTriangle()
	{
		int n = 4; 
		int counter = n;
		while (counter > 0)
		{	
			String PrintString = "*";
			int StarCounter = counter;
			while (StarCounter > 1)
			{
				PrintString += "*";
				StarCounter -= 1;
			}
			
			System.out.println(PrintString);
			counter -= 1;
		}
	
	}
}