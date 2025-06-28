//wap to find sum of numbers in given range
void rangesum();
void main()
{
	rangesum();
}
void rangesum()
{
	int start,end,sum=0;
	printf("enter starting and ending number: ");
	scanf("%d%d",&start,&end);
	printf("\n%d and %d is starting and ending",start,end);
	for(int i=start;i<=end;i++)
		sum = sum+i;
	
	printf("\n%d is sum of integers ",sum);
}