//find minimum and maximum from array
void main()
{
	int arr[10];
	printf("enter the array elements:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\nArray elements are:");
	for(int i=0;i<10;i++)
	{
		printf("%d ",arr[i]);
	}
	
	int max=arr[0];
	for(int i=1;i<10;i++)
	{
		if(arr[i]>max)
			max = arr[i];
	}
	printf("\n%d is maximum from array",max);
	
	int min=arr[0];
	for(int i=1;i<10;i++)
	{
		if(arr[i]<min)
			min = arr[i];
	}
	printf("\n%d is minimum from array",min);
	
}