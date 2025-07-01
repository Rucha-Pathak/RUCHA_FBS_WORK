//wap to add two numbers
void sum(int,int);
void main()
{
	int a,b;
	printf("Enter two numbers: ");
	scanf("%d%d",&a,&b);
	sum(a,b);
}
void sum(int n1,int n2)
{
	int add = n1+n2;
	printf("%d is sum of %d and %d",add,n1,n2);
}