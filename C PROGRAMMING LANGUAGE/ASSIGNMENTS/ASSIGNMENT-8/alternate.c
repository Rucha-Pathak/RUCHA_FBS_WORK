int alternate(int[],int);
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
	alternate(arr,size);
}
int alternate(int a[],int n)
{
	printf("\nalternate numbers: ");
  for(int i=0;i<n;i+=2)
  	printf("%d  ",a[i]);
}