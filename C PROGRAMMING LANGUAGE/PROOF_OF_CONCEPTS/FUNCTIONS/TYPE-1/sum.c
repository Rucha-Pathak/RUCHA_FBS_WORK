void sum();
void main()
{
	sum();
}
void sum()
{
	int a,b;
	printf("Enter the two numbers:");
	scanf("%d%d",&a,&b);
	int sum = a+b;
	printf("\n%d is sum of two numbers",sum);
}