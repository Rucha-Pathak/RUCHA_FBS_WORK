//wap to create structure of Date (date, month, year)
struct Date {
	int date;
	int month;
	int year;
};
void main()
{
	struct Date d;
	printf("Enter details of date: ");
	printf("\nenter date: ");
	scanf("%d",&d.date);
	printf("enter month: ");
	scanf("%d",&d.month);
	printf("enter year : ");
	scanf("%d",&d.year);
	printf("date is : %d/%d/%d ",d.date,d.month,d.year);
	
}
