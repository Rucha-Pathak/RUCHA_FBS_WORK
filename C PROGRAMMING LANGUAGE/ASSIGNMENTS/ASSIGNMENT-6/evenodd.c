void isevenodd();
void main()
{
	isevenodd();
}
void isevenodd()
{
	int num;
	printf("enter the number :");
	scanf("%d",&num);
	if(num%2==0)
	{
		printf("\n%d is even",num);
	}
	else
		printf("\n%d is odd",num);
}