//print prime numbers of array
void main()
{
	int arr[10];
	printf("enter the array elements:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\narray elements are:");
	for(int i=0;i<10;i++)
	{
		printf("%d  ",arr[i]);
	}
	
	printf("\nPrime numbers from array are:");
	for(int i=0;i<10;i++)
	{
		int num=arr[i],status=0;
		for(int j=2;j<num;j++){
			if(num%j==0)
			{
				status++;
				break;
			}
		}
		if(status==0)
			printf("\n%d is prime",num);
	}
}