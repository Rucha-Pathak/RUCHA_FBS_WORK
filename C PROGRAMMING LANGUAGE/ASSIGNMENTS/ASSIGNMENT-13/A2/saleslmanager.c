//SalesManager (id, name, salary, incentive, target)
struct Salesmanager storedetails();
void display(struct Salesmanager);
struct Salesmanager{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
};
void main()
{
	struct Salesmanager h1;
	printf("enter the details of HR: ");
	h1 = storedetails();
    printf("HR details are: ");
    display(h1);
	
}
struct Salesmanager storedetails()
{
	struct Salesmanager h1;
	scanf("%d",&h1.id);
	scanf("%s",h1.name);
	scanf("%lf",&h1.salary);
	scanf("%lf",&h1.incentive);
	scanf("%d",&h1.target);
	return h1;
}
void display(struct Salesmanager h)
{
	printf("\n%d\n%s\n%.2lf\n%.2lf\n%d",h.id,h.name,h.salary,h.incentive,h.target);
}