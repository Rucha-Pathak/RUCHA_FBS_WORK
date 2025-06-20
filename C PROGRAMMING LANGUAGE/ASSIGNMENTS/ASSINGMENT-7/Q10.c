//print hollow square with diagonal pattern 
void main()
{
	int n;
	printf("enter n:");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||i==1||j==n||i==n||i==j){
				
					printf("* ");
			}
			else
				printf("  ");
		}
		printf("\n");
	}
}