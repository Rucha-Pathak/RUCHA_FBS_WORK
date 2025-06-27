void square();
void cube();
void main()
{
	square();
	cube();
}
void square()
{
	int a;
	printf("enter the number:");
	scanf("%d",&a);
	int sq = a*a;
	printf("%d is square of number %d",sq,a);
}
void cube()
{
	int a;
	printf("\nenter the number:");
	scanf("%d",&a);
	int cube = a*a*a;
	printf("%d is cube of number %d",cube,a);
}