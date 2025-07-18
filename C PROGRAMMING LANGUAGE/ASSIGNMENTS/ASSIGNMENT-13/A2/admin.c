//Admin (id, name, salary, allowance)
struct admin storedetails();
void display(struct admin);
struct admin{
	int id;
	char name[20];
	double salary;
	double allowance;
};
void main()
{
	struct admin a1;
	printf("enter the details of admin: ");
	a1 = storedetails();
    printf("admin details are: ");
    display(a1);
	
}
struct admin storedetails()
{
	struct admin e;
	scanf("%d",&e.id);
	scanf("%s",e.name);
	scanf("%lf",&e.salary);
	scanf("%lf",&e.allowance);
	return e;
}
void display(struct admin adm)
{
	printf("\n%d\n%s\n%.2lf\n%.2lf",adm.id,adm.name,adm.salary,adm.allowance);
}