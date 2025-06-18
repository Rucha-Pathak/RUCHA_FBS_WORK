//print armstrong numbers from 1 to n
void main()
{
	int n;
	printf("enter upper limit :");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++)
	{
		int count=0, rem,sum=0,temp;
		temp = i;
		int num = i;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		num=i;
		while(num>0)
		{
			int res=1;
			rem =num%10;
			for(int j=1;j<=count;j++)
			{
				res = res*rem;
			}
			sum = sum+res;
			num=num/10;
		}
		
		if(sum == temp)
			printf("%d ",temp);
		
	}
	
}