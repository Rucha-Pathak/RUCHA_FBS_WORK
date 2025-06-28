//wap to check number is prime or not
void isprime();
void main()
{
	isprime();
}
void isprime()
{
	int n,flag=0;
	printf("enter the number: ");
	scanf("%d",&n);
	for(int i=2;i<n;i++)
		if(n%i==0)
			flag = 1;
			
	if(flag ==0)
		printf("\n%d is prime number", n);
	else
		printf("\n%d is not prime number", n);
}