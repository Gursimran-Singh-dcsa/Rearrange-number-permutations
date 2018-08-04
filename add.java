class add{
	public static void main(String[] args) {
		int i[]=new int[args.length];
		for(int j=0;j<args.length;j++)
		{
			i[j]=Integer.parseInt(args[j]);
		}
		//System.out.println("Sum of ");
		int sum=0;
		for(int k=0;k<i.length;k++)
		{
			if(k==i.length-1)
			{
			System.out.print(i[k]+" = ");
			}
			else
			{
				System.out.print(i[k]+" + ");
			}
			sum=sum+i[k];
		}	
		System.out.print(sum);
	}
}