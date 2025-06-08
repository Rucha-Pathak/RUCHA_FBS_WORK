void main(){
	int n,num,fact = 1;
	printf("enter the number:");
	scanf("%d",&n);
	num=n;
	
	while(1<=n){
		fact = fact*n;
		n--;
	}
	printf("factorial of %d is %d",num,fact);
}