//wap to create structure of employee
struct Employee{
	int id;
	char name[20];
	double salary;
};
void main()
{
	struct Employee e1,e2,e3;
	printf("Enter deails of Employee1 : ");
	scanf("%d",&e1.id);
	scanf("%s",e1.name);
	scanf("%lf",&e1.salary);
	
	printf("Enter deails of Employee2 : ");
	scanf("%d",&e2.id);
	scanf("%s",e2.name);
	scanf("%lf",&e2.salary);
	
	printf("Enter deails of Employee3 : ");
	scanf("%d",&e3.id);
	scanf("%s",e3.name);
	scanf("%lf",&e3.salary);
	
	printf("\nEmployee details are:\nEmployee1 details:  ");
	printf("id = %d\tName = %s\tSalary = %.2f",e1.id,e1.name,e1.salary);
	printf("\nEmployee2 details: ");
	printf("id = %d\tName = %s\tSalary = %.2f",e2.id,e2.name,e2.salary);
	printf("\nStudent3 details: ");
	printf("id = %d\tName = %s\tSalary = %.2f",e3.id,e3.name,e3.salary);
}