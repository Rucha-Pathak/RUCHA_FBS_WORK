//WAP to sort the array 
void main()
{
	int arr[100],size,temp;
	printf("enter the size of array: ");
	scanf("%d",&size);
	
	printf("enter the array elements :");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nArray elements are:");
	for(int i=0;i<size;i++)
    {
    	printf("%d  ",arr[i]);
	}
	
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	printf("\nsorted array elements in ascending order: ");
	for(int i=0;i<size;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(arr[j]<arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	printf("\nsorted array elements in descending order: ");
	for(int i=0;i<size;i++)
	{
		printf("%d  ",arr[i]);
	}
	
}