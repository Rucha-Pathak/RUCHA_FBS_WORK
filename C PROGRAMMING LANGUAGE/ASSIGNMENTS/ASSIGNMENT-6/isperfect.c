//wap to check number is perfect or not 
void isperfect();
void main()
{
	isperfect();
}
void isperfect()
{
	int num,sum=0;
	printf("Enter the number: ");
	scanf("%d",&num);
	for(int i=1;i<num;i++)
		if(num%i==0)
			sum = sum+i;
		
	if(sum==num)
		printf("\n%d is perfect number ",num);
	else
		printf("\n%d is not perfect number ",num);
	
}