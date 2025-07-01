//wap to find square and cube 
void square(int);
void cube(int);
void main()
{
	int n;
	printf("Enter the number: ");
	scanf("%d",&n);
	square(n);
	cube(n);
}
void square(int a)
{
	printf("\nsquare of number %d is %d",a,a*a);
}
void cube(int a)
{
	printf("\nsquare of number %d is %d",a,a*a*a);
}