//wap to find factorial of number
void fact();
void main()
{
	fact();
}
void fact()
{
	int num,fact=1;
	printf("Enter the number: ");
	scanf("%d",&num);
	printf("%d is number",num);
	for(int i=num;i>0;i--)
		fact*=i;
		
	printf("\n%d is factorial of %d ",fact,num);
}