//wap to print table of number;
void table();
void main()
{
	table();
}
void table()
{
	int n;
	printf("enter the number: ");
	scanf("%d",&n);
	for(int i=1;i<11;i++)
	{
		printf("\n%d * %d = %d ",n,i,n*i);
	}
}