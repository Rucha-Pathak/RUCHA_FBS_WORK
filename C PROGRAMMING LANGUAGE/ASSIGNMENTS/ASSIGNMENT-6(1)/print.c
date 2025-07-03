//with returntype and with parameter
int print(int,int);
void main()
{
	int a,b;
	printf("Enter starting and ending : ");
	scanf("%d%d",&a,&b);
	print(a,b);
}
int print(int a,int b)
{
	for(int i=a;i<=b;i++)
		printf("%d\t",i);
}