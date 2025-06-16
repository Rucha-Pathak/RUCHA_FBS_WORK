//print floyd's triangle pattern 

void main()
{
	int n,count=0;
	printf("enter number:");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		
		for(int j=1;j<=i;j++){
			count++;
			printf("%d ",count);
			
		}
		printf("\n");
	}
}