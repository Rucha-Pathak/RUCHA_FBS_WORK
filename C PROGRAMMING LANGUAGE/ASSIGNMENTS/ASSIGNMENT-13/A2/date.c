//6. Date (date, month, year)
//declare structure and store and display details 

struct Date storedetails();
void display(struct Date);
struct Date{
	int date;
	int month;
	int year;
};
void main()
{
	struct Date s1;
	printf("enter the details of date: ");
	s1 = storedetails();
	printf("Details of date are: ");
	display(s1);
}
struct Date storedetails()
{
	struct Date temp;
	scanf("%d",&temp.date);
	scanf("%d",&temp.month);
	scanf("%d",&temp.year);
	return temp;
}
void display(struct Date stud)
{
	printf("\n%d-%d-%d",stud.date,stud.month,stud.year);
}