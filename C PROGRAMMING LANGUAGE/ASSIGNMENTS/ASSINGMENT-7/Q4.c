//find odd and even among the numbers
void main()
{
	int arr[10];
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
		if(arr[i]%2==0)
			printf("\n%d is even",arr[i]);
		else
			printf("\n%d is odd",arr[i]);
	}
}