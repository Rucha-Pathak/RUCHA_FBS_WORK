//WAP to check if year is leap or not

void main() {

	int year ;

	printf("enter the year:");
	scanf("%d",&year);

//	if(year % 4==0 &&  year%100!=0 || year %400 ==0)
//		printf("%d is leap year", year);
//	else
//		printf("%d is not leap year",year);

	year % 4==0 &&  year%100!=0 || year%400 ==0 ? printf("%d is leap year", year) : printf("%d is not leap year",year);

}