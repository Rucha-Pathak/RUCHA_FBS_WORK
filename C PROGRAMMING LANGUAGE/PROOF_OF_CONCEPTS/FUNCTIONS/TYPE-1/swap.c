void swap();
void main()
{
	swap();
}
void swap()
{
	int a,b;
	printf("enter two numbers:");
	scanf("%d%d",&a,&b);
	printf("\nbefore swappying numbers are %d and %d",a,b);
	int temp = a;
	a = b;
	b = temp;
	
	printf("\nafter swappying numbers are %d and %d",a,b);
}