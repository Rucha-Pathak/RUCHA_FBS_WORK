//wap to create structure SalesManager (id, name, salary, incentive, target)
struct salesmanager{
	int id ;
	char name[20];
	double salary;
	float incentive;
	int target;
};

void main()
{
	struct salesmanager mansi;
	printf("Enter the details of salesmanager: ");
	printf("\nenter id :");
	scanf("%d",&mansi.id);
	printf("\nenter name :");
	scanf("%s",mansi.name);
	printf("\nenter salary:");
	scanf("%lf",&mansi.salary);
	printf("\nenter incentive :");
	scanf("%f",&mansi.incentive);
	printf("\nenter target :");
	scanf("%d",&mansi.target);
	printf("\ndetails of salesmanager mansi are: ");
	printf("id=%d\tname=%s\tsalary=%.2lf\tincentive=%.2f\ttarget=%d",mansi.id,mansi.name,mansi.salary,mansi.incentive,mansi.target);
	
}
