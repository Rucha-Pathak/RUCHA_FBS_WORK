//wap to check number is palindrome or not
void ispalindrome();
void main()
{
	ispalindrome();
}
void ispalindrome()
{
	int num,rem,rev=0,temp;
	printf("enter the number: ");
	scanf("%d",&num);
	printf("\n%d is number to check palindrome or not",num);
	temp = num;
	
	while(temp>0)
	{
		rem = temp%10;
		rev = rev*10+rem;
		temp/=10;
	}
	
	if(rev==num)
		printf("\n%d is palindrome ",rev);
	else
		printf("\n%d is not palindrome ",num);
}