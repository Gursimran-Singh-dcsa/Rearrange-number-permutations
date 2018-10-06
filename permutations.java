import java.util.*;
class permutations{
	public static void main(String[] args) {
	  	Scanner s=new Scanner(System.in);
	  	System.out.println("please enter a string whose all possible permutations are needed");
	    StringBuilder sb=new StringBuilder(s.nextLine());
	    char chararray[]=new char[sb.length()];
	    for(int i=0;i<sb.length();i++)
	    {
	    	chararray[i]=sb.charAt(i);
	    }
	    int totalperm=fact(sb.length());
        String answer[]=new String[totalperm];
        	int i=0;
		while(i<answer.length)
		{
			answer[i]="";
			i++;
		}
		int index[][]=new int[answer.length][chararray.length];
		i=0;
			while(i<index.length)
		{
			for(int t=0;t<chararray.length;t++)
			index[i][t]=chararray.length;
			i++;
		}
		
        logic(answer,chararray,index,chararray.length,-1);
        System.out.println("");
        for(int t=0;t<answer.length;t++)
        {
        	System.out.println(answer[t]);
        }	

	  	//int numarray[]=new int[numb];

	}
	public static int fact(int n)
	{
		if(n==0)
			return(1);
		if(n>1)
		{

		 return(n*fact(n-1));
		}
		return(n);
	}


	public static void logic(String[] answer, char[] chararray,int[][] index,int times,int indexx)
	{
	if(times>=1)
	{	
		int i=0;
		int j=0;
		int t=++indexx;
        while(i<answer.length)
        {
        	if(j>=chararray.length)
				j=0;

		for(int k=0;k<fact(times-1);k++)
		{
			
			int flag=1;
			for(int p=0;p<chararray.length;p++)
			{
				if(j==index[i][p])
				{
					flag=0;
					if(j<chararray.length)
					j++;
				    else
				    	j=0;
					
				}
			}
			if((j<chararray.length)&&(flag==1))
			{
				answer[i]=answer[i]+chararray[j];
		   index[i][t]=j;
		    i++;
		 }
		 else
		 	k--;
		}	
		j++;
	    }
        logic(answer,chararray,index,times-1,t);
    }
    else
    	return;
	}

}