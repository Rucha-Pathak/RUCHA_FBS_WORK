void main(){
	
	int year = 2024;
	int is_true;
	
	is_true = year%4==0 && (year %100 !=0 || year%400==0);
	if(is_true){
		printf("%d is leap year",year);
	}
	else{
		printf("%d is not leap year",year);
	}
	
	
	
}