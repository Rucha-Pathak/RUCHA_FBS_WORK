//wap to create structure Admin (id, name, salary, allowance)
struct Admin{
	int id;
	char name[20];
	double salary;
	double allowance;
};
void main()
{
	struct Admin a1;
	printf("Enter admin details: ");
	printf("\nenter id of admin: ");
	scanf("%d",&a1.id);
	printf("enter name of admin: ");
	scanf("%s",a1.name);
	printf("enter salary of admin: ");
	scanf("%lf",&a1.salary);
	printf("enter allowance of admin: ");
	scanf("%lf",&a1.allowance);
	printf("\nAdmin details are\nId = %d\tName = %s\tSalary = %.2lf\tAllowance = %.2lf ",a1.id,a1.name,a1.salary,a1.allowance);
}