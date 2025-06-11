void main(){
	
	int n,temp,fact = 1;
	printf("enter the number:");
	scanf("%d",&n);
	temp = n;
	
	while(n>0){
		fact = fact*n;
		n--;
	}
	printf("factorial of %d is %d",temp,fact);
}