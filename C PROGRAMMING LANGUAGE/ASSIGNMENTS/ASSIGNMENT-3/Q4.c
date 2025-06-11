void main(){
	int n,status=0;
	printf("Enter the number:");
	scanf("%d",&n);
	
	for(int i=2;i<(n/2);i++){
		if(n%i==0)
		status++;
        break;
	}
	if(status==0)
		printf("%d is prime ",n);
	else
		printf("%d is not prime ",n);
	
	
}