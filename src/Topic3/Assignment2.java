package Topic3;

public class Assignment2
{
	public static void main(String[] args)
	{
		String name1 = args[0];
		String name2 = args[1];

		try{
			int name1sub1 = Integer.parseInt(args[2]);
			int name1sub2 = Integer.parseInt(args[3]);
			int name1sub3 = Integer.parseInt(args[4]);
			int name2s1 = Integer.parseInt(args[5]);
			int name2s2 = Integer.parseInt(args[6]);
			int name2s3 = Integer.parseInt(args[7]);
			float avg1= (name1sub1+name1sub2+name1sub3)/3;
			float avg2 = (name2s1+name2s2+name2s3)/3;

			System.out.println("Average marks of " +name1+ " : " +avg1 );
			System.out.println("Average marks of " +name2+ " : " +avg2 );
		} 
		catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}