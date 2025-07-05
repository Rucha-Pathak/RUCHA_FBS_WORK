int sum(int[] ,int);
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
	printf("\n%d is sum of array elements",sum(arr,size));
}
int sum(int a[],int n)
{
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
	}
	return sum;
}