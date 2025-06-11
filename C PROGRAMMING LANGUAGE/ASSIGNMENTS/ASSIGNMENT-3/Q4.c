void main(){
	int n,i=1;
	printf("Enter number :");
	scanf("%d",&n);
	
	while(i<n+1){
		if(n%i!=0 && n%1==0 && n%n==0)
			printf("it is prime");
		else
		    printf("it is not prime");
	i++;
	}
}