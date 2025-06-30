//wap to create structure HR (id, name, salary, commission)
struct HR
{
   int id;
   char name[20];
   double salary;
   double commission;	
};
void main()
{
	struct HR h1;
	printf("Enter details of HR : ");
	printf("\nEnter id of HR : ");
	scanf("%d",&h1.id);
	printf("Enter name of HR : ");
	scanf("%s",h1.name);
	printf("Enter salary of HR : ");
	scanf("%lf",&h1.salary);
	printf("Enter commission of HR : ");
	scanf("%lf",&h1.commission);
	printf("\nDetails of hr : ");
	printf("id = %d\tname=%s\tsalary = %.2lf\tcommission = %.2lf",h1.id,h1.name,h1.salary,h1.commission);
}