struct employee storedetails();
void display(struct employee);
struct employee{
	int id;
	char name[20];
	double salary;
};
void main()
{
	struct employee e1;
	printf("enter the details of employee: ");
	e1 = storedetails();
    printf("employee details are: ");
    display(e1);
	
}
struct employee storedetails()
{
	struct employee e;
	scanf("%d",&e.id);
	scanf("%s",e.name);
	scanf("%lf",&e.salary);
	return e;
}
void display(struct employee emp)
{
	printf("\n%d\n%s\n%.2lf",emp.id,emp.name,emp.salary);
}