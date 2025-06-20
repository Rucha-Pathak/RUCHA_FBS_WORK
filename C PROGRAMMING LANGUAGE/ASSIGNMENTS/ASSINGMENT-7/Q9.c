//Wap to reverse the array
void main()
{
	int arr[10];
	printf("enter the array elements: ");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Array elements are: ");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	int temp;
    for(int i=0; i<10/2 ; i++)
    {
    	temp = arr[i];
        arr[i] = arr[10 - 1 - i];
        arr[10 - 1 - i] = temp;
	}
	
	printf("\nnew array elements are: ");
	
	for(int i=0; i<10 ; i++)
	{
		printf("%d  ",arr[i]);
	}




}
