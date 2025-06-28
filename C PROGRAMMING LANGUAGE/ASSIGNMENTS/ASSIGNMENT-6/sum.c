//wap to add two integers display result 
void sum();
void main()
{
	sum();
}
void sum()
{
	int a,b;
	printf("enter two numbers :");
	scanf("%d%d",&a,&b);
	int sum = a+b;
	printf("\n%d is sum of %d and %d",sum,a,b);
}