package Topic3;


public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How was your day today";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+ str+" = "+count);
	}

}
