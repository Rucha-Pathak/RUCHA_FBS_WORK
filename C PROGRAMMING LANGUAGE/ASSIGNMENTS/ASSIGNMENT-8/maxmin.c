//find max and min of array
int findmax(int[],int);
int findmin(int[], int);
void main()
{
	int arr[100],size;
	printf("enter size of array: ");
	scanf("%d",&size);
	printf("\nenter array elements: ");
	for(int i=0;i<size;i++)
		scanf("%d",&arr[i]);
	printf("\narray elements: ");
	for(int i=0;i<size;i++)
		printf("%d  ",arr[i]);	
	
	int max = findmax(arr,size);
    printf("\n%d is maximum from array",max);
    int min = findmin(arr,size);
    printf("\n%d is minimum from array",min);
    
}
int findmax(int a[] , int n)
{
	int max = a[0];
	for(int i=0;i<n;i++)
		if(a[i]>max)
			max = a[i];
	return max;
}
int findmin(int a[] , int n)
{
	int min = a[0];
	for(int i=0;i<n;i++)
		if(a[i]<min)
			min = a[i];
	return min;
}