//find sum of all array elements
void main()
{
	int arr[10],sum=0;
	printf("enter the array elements:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\narray elements are:");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	for(int i=0;i<10;i++)
	{
		sum = sum+arr[i];
	}
	printf("\nsum of array elements is : %d",sum);
}