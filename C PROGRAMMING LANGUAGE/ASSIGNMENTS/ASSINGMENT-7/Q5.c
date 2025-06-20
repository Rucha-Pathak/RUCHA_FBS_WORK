//print alternate element in arry
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
	printf("\nalternate elements in an array :");
	for(int i=0;i<10;i+=2)
	{
		printf("%d  ",arr[i]);
	}
}