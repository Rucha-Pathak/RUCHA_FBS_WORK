void main(){
	int num,r1,r2;
	printf("enter the number : ");
	scanf("%d",&num);
	r1 = num%10;
	r2 = num/100;
	if(r1==r2)
		printf("\nIt is palindrome");
	else
	    printf("\nIt is not palindrome");
	
}