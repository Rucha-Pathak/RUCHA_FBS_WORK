//wap input marks of five subjects and find total marks and calculate percentage
void totalmarks();
void percentage();
void main()
{
	totalmarks();
	percentage();
}
void totalmarks()
{
	//max marks of 1 subject is 100
	int m1,m2,m3,m4,m5;
	printf("enter marks of 5 subjects:");
	scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
	int total_marks = m1+m2+m3+m4+m5;
	printf("\n%d is total marks ",total_marks);
}
void percentage()
{
	int m1,m2,m3,m4,m5,max_marks=500;
	printf("\nenter marks of 5 subjects:");
	scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
	int total_marks = m1+m2+m3+m4+m5;
	printf("\n%d is total marks ",total_marks);
	
	float percent = (total_marks*100)/max_marks;
	printf("\n%.2f  is percentage ",percent);
}