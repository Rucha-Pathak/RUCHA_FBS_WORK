void main(){
	
	char c;
	int a,b;
	printf("enter the operator: ");
	scanf(" %c",&c);
	
	printf("\nenter the numbers: ");
	scanf("%d %d",&a,&b);
	
	
	if(c=='+')
		printf("\naddition is %d",a+b);
	else if(c=='-')
		printf("\nsubtraction is %d",a-b);
	else if(c=='/')
		printf("\ndivision is %d",a/b);
	else if(c=='*')
		printf("\nmultiplication is %d",a*b);
	else
		printf("\nmodulus is %d",a%b);
		
	
	
}