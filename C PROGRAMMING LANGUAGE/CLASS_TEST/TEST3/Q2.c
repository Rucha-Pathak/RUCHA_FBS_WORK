//wap to add alternate numbers in range
void main()
{
	int s,e,sum=0;
	printf("enter the starting and ending :");
	scanf("%d%d",&s,&e);
	printf("\nstarting is %d ",s);
	printf("\nending is %d ",e);
	
	for(int i=s;i<=e;i+=2)
	{
		sum = sum+i;
	}
	printf("\nsum of alternate numbers in given range: %d",sum);
}