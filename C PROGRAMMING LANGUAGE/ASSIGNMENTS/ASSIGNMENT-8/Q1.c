//WAP to find minimum and maximum elements in array
int findmin(int arr[], int size);
int findmax(int arr[], int size);
void main()
{
	int arr[50],size;
	printf("enter the size of array:");
	scanf("%d",&size);
	
	printf("\nenter the array elements:");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\narray elements are: ");
	for(int i=0;i<size;i++)
    {
    	printf("%d  ",arr[i]);
	}
	
	printf("\n minimum from array is %d:",findmin(arr,size));
	printf("\n maximum from array is %d:",findmax(arr,size));
}

int findmin(int arr[], int size)
{
	int min =arr[0];
	for(int i=1;i<size;i++)
	{
		if(arr[i]<min)
			min =arr[i];
	}
	return min;
}

int findmax(int arr[], int size)
{
	int max=arr[0];
	for(int i=0;i<size;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	return max;
}