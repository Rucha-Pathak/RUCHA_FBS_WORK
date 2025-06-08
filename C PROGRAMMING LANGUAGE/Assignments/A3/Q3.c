void main(){
	int start,end,sum=0;
	printf("Enter start and end value:");
	scanf("%d %d",&start ,&end);
	
	while(start<=end){
		
		sum = sum+start;
		start++;
	}
	printf("%d",sum);
}