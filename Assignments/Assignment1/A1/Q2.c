void main(){
	
	int num = 453;
	int r1,r2,q1,q2,rev;
	
	printf("%d is number",num);
	r1 = num%10; //1
	q1 = num/10; //12
	r2 = q1%10; //2
	q2 = q1/10; //1
	
	rev = r1*100+r2*10+q2;
	printf("\n%d is reverse",rev);
	
	if(num==rev){
		printf("\n%d is pallindrome",num);
	}
	else{
		printf("\n%d is not pallindrome",num);
	}
	
}