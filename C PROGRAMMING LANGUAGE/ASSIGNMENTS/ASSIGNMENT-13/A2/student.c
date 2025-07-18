//declare structure and store and display details 

struct student storedetails();
void display(struct student);
struct student{
	int rollno;
	char name[20];
	int marks;
};
void main()
{
	struct student s1;
	printf("enter the details of student: ");
	s1 = storedetails();
	printf("Details of student are: ");
	display(s1);
}
struct student storedetails()
{
	struct student temp;
	scanf("%d",&temp.rollno);
	scanf("%s",temp.name);
	scanf("%d",&temp.marks);
	return temp;
}
void display(struct student stud)
{
	printf("%d\n%s\n%d",stud.rollno,stud.name,stud.marks);
}