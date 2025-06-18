//print prime numbers from 1 to n
void main()
{
	int n;
	printf("enter upper limit:");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++)
	{
		int num=i,status=0;
		for(int j=2;j<=(num/2);j++)
		{
			if(num%j==0)
			{
				status++;
				break;
			}
		}
		if(status==0)
			printf("%d ",num);
	}
}