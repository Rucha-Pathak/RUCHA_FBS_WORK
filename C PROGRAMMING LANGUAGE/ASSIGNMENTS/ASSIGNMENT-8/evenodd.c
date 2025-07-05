int evenodd(int[] ,int size);
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
	evenodd(arr,size);
}
int evenodd(int a[] ,int n)
{
	printf("\neven numbers :");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
			printf("%d  ",a[i]);
	}
	printf("\nodd numbers :");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
			printf("%d  ",a[i]);
	}
}
