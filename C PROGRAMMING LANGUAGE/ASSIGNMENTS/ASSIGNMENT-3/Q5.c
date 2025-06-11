void main(){
	int num,count=0,temp,rem,sum = 0;
	printf("enter the number:");
	scanf("%d",&num);
	temp = num;
	
	while(num>0){
		count++;
		num = num/10;
	}
	
	num = temp;
	while(num>0){
		int res = 1;
		rem = num%10;
		for(int i=1;i<=count;i++)
			res = res*rem;
	
	sum = sum +res;	
	num = num/10;
	}
	
	if(sum == temp)
		printf("%d is armstrong",temp);
	else
		printf("%d is not armstrong",temp);
	
	
	
	
}