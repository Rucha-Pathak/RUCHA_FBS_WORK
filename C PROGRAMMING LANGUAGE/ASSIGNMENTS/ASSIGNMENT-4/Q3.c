//print perfect numbers from 1 to n
void main()
{
	int n;
	printf("enter upper limit:");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++)
	{
		int num=i,sum=0;
		for(int j=1;j<num;j++)
		{
			if(num%j==0)
				sum = sum+j;
		}
		if(sum==num)
			printf("%d ",num);
	}
}