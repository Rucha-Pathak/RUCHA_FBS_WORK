//wap to create structure student
struct Student{
	int rollNo;
	char name[20];
	int marks;
};
void main()
{
	struct Student s1,s2,s3;
	printf("Enter deails of student1 : ");
	scanf("%d",&s1.rollNo);
	scanf("%s",s1.name);
	scanf("%d",&s1.marks);
	
	printf("Enter deails of student2 : ");
	scanf("%d",&s2.rollNo);
	scanf("%s",s2.name);
	scanf("%d",&s2.marks);
	
	printf("Enter deails of student3 : ");
	scanf("%d",&s3.rollNo);
	scanf("%s",s3.name);
	scanf("%d",&s3.marks);
	
	printf("\nStudent details are:\nStudent1 details:  ");
	printf("RollNo = %d\tName = %s\tMarks = %d",s1.rollNo,s1.name,s1.marks);
	printf("\nStudent2 details: ");
	printf("RollNo = %d\tName = %s\tMarks = %d",s2.rollNo,s2.name,s2.marks);
	printf("\nStudent3 details: ");
	printf("RollNo = %d\tName = %s\tMarks = %d",s3.rollNo,s3.name,s3.marks);
}