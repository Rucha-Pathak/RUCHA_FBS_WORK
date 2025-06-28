//wap to check number is armstrong or not
void isarmstrong();
void main()
{
	isarmstrong();
}
void isarmstrong()
{
	int n,count=0,sum=0;
	printf("enter the number:  ");
	scanf("%d",&n);
	int temp = n;
	
	while(n>0)
	{
		count++;
		n = n/10;
	}
	n = temp;
	while(n>0)
	{
		int res = 1;
		int rem = n%10;
		for(int i=1;i<=count;i++)
		{
			res = res*rem;
		}
		sum = sum+res;
		n/=10;
	}
	if(sum==temp)
		printf("\n%d is armstrong number",temp);
	else
		printf("\n%d is not armstrong number",temp);
}