//4. HR (id, name, salary, commission)
struct HR storedetails();
void display(struct HR);
struct HR{
	int id;
	char name[20];
	double salary;
	double commission;
};
void main()
{
	struct HR h1;
	printf("enter the details of HR: ");
	h1 = storedetails();
    printf("HR details are: ");
    display(h1);
	
}
struct HR storedetails()
{
	struct HR h1;
	scanf("%d",&h1.id);
	scanf("%s",h1.name);
	scanf("%lf",&h1.salary);
	scanf("%lf",&h1.commission);
	return h1;
}
void display(struct HR h)
{
	printf("\n%d\n%s\n%.2lf\n%.2lf",h.id,h.name,h.salary,h.commission);
}                                                       