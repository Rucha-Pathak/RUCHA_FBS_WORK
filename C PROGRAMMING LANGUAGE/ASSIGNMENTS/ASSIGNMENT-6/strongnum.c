//wap to check number is strong or not
void isstrong();
void main()
{
	isstrong();
}
void isstrong()
{
	int num,sum=0;
	printf("Enter the number: ");
	scanf("%d",&num);
	int temp = num;
	
	while(num>0)
	{
		int fact = 1;
		int rem = num%10;
		for(int i=rem;i>0;i--)
		{
			fact*=i;
		}
		sum+=fact;
		num/=10;
	}
	if(sum == temp)
		printf("\n%d is strong number",temp);
	else
		printf("\n%d is not strong number",temp);
}