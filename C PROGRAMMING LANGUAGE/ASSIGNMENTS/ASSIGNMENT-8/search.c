int search(int[],int,int);
void main()
{
	int arr[100],size,num;
	printf("enter size of array: ");
	scanf("%d",&size);
	printf("\nenter array elements: ");
	for(int i=0;i<size;i++)
		scanf("%d",&arr[i]);
	printf("\narray elements: ");
	for(int i=0;i<size;i++)
		printf("%d  ",arr[i]);	
	printf("\nenter number to search: ");
	scanf("%d",&num);
	printf("%d is number",num);
}
int search(int a[],int n,int b)
{
	for(int i=0;i<n;i++)
	{
		if(a[i]==b)
			printf("\n%d number found at %d index",b,i);
	}
	
}








