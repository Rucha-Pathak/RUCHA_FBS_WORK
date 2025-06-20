//search given number in array
void main()
{
	int num,ispresent=0;
	printf("enter the number :");
	scanf("%d",&num);
	
	int arr[10];
	printf("\nenter the array elements");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nArray elements are:");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	for(int i=0;i<10;i++)
	{
		if(arr[i]==num)
		{
			printf("\n%d found at %d index",num,i);
			ispresent = 1;
		}
	}
	if(ispresent==0)
		printf("%d is not found",num);
	
}