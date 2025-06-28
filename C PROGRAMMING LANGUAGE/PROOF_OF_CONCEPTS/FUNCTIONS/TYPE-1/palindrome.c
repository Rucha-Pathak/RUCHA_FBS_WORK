//wap to check wheather number is palindrome or not
void ispalindrome();
void main()
{
	ispalindrome();
}
void ispalindrome()
{
	int num,temp,rev=0,rem;
	printf("enter number to check palindrome or not: ");
	scanf("%d",&num);
	printf("\n%d is number" ,num);
	
	temp = num;
	while(num>0)
	{
		rem = num%10;
		rev = rev*10+rem;
	    num/=10;
	}
	if(temp==rev)
		printf("\n%d is palindrome number",rev);
	else
		printf("\n%d is not palindrome number",rev);
}