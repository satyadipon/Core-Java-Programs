package codes;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeWhiteSpaces("A BB  CCC	DDD .");
	}
	
	static void removeWhiteSpaces(String s)
	{
		
		char[] c = s.toCharArray();
		
		String news = "";
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ' && c[i]!='\t')
				news=news+c[i];
		}
		
		System.out.println(news);
		
	}

}
