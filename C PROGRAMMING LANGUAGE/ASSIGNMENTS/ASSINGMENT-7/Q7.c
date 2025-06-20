//sum of two arrays
void main()
{
	int arr[10];
	int brr[10];
	int crr[10];
	printf("enter the array elements off arr:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\narray elements of arr are:");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",arr[i]);
	}
	printf("\nenter the array elements of brr:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("\narray elements of brr are:");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",brr[i]);
	}
	
	
	for(int i=0;i<10;i++)
	{
		crr[i] = arr[i]+brr[i];
	}
	printf("\nsum of two arrays are: ");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",crr[i]);
	}
}