package javaprograms;

public class reverseeachwordinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java";
		String[] words=str.split(" ");
		String resultString="";
		for(String w:words) 
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--) 
			{
				reverseword=reverseword+w.charAt(i);
			}
			resultString=resultString+reverseword+" ";
			
		}
      System.out.println("resultString = "+resultString);
	}

}
