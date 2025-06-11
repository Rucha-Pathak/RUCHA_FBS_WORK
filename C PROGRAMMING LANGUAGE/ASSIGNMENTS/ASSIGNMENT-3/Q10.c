void main(){
	int num,r1,r2;
	printf("enter the number:");
	scanf("%d",&num);
	r1 = num%10;
	r2 = num/10000;
	int sum = r1+r2;
	printf("sum of first and last digit is %d",sum);
}