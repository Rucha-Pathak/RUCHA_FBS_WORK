void main(){
	int n,sum=0,rem;
	printf("enter number:");
	scanf("%d",&n);
	int temp=n;
	
	while(n>0)
	{
		rem=n%10;
		int fact = 1;
		for(int i=rem;i>=1;i--){
			fact = fact*i;
		}
		sum = sum+fact;
		n = n/10;
	}
	
	if(temp==sum)
		printf("%d is strong number",temp);
	else
		printf("%d is not strong number",temp);
}