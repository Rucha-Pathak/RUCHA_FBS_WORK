//print strong numbers from 1 to n
void main()
{
	int n;
	printf("enter upper limit:");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++)
	{
		int temp=i;
		int num=i,rem,sum=0;
		while(num>0)
		{
			rem = num%10;
			int fact=1;
			for(int j=rem;j>=1;j--)
			{
				fact = fact*j;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(temp==sum)
			printf("%d ",temp);	
	}
	
}