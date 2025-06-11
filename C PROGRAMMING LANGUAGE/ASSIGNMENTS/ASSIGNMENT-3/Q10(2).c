void main(){
	int num,ldigit,fdigit,sum = 0;
	printf("enter the number:");
	scanf("%d",&num);
	
	int temp = num;
	ldigit = num%100;
	while(num>10){
		fdigit = num%100;
		num = num/100;
	}

sum  = ldigit + fdigit;
printf("sum of first and last digit of %d is %d",temp,sum);




}