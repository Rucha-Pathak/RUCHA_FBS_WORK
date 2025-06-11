void main(){
	int num,ldigit,fdigit,sum = 0;
	printf("enter the number:");
	scanf("%d",&num);
	
	int temp = num;
	ldigit = num%10;
	while(num>0){
		fdigit = num%10;
		num = num/10;
	}

sum  = ldigit + fdigit;
printf("sum of first and last digit of %d is %d",temp,sum);




}