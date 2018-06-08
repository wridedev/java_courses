public class Calculate{
	
	public static void main(String[] arg)	{
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		String zn = arg[1];
		int second = Integer.valueOf(arg[2]);
		int summ=0;

		
		if(zn.equals("+")) summ = first + second;
		if(zn.equals("-")) summ = first - second;
		if(zn.equals("*")) summ = first * second;
		if(zn.equals("/")) summ = first / second;
		if(zn.equals("%")) summ = first % second;
		
		if(summ == 0) System.out.println("ne pravilniy mat. znak");
		else
		System.out.println("Sum = " + summ + zn);
		
	}
}
