//wap to check whether year is leap or not
void isleapyr();
void main()
{
	isleapyr();
}
void isleapyr()
{
	int yr;
	printf("enter the year to check leap or not: ");
	scanf("%d",&yr);
	if(yr%4==0 && yr%100!=0 || yr%400==0)
		printf("\n%d is leap year",yr);
	else
		printf("\n%d is not leap year",yr);
}