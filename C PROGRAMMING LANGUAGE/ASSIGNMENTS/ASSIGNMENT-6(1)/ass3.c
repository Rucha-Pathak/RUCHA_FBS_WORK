//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.
void triangle(int,int,int);
void greatest(int,int,int);
void result(int);
void divisible(int);
void personstatus(int);

void main()
{
	int s1,s2,s3;
	printf("Enter sides of traingle : ");
	scanf("%d%d%d",&s1,&s2,&s3);
	triangle(s1,s2,s3);
	
	int n1,n2,n3;
	printf("\nenter three numbers: ");
	scanf("%d%d%d",&n1,&n2,&n3);
	greatest(n1,n2,n3);
	
	int marks;
	printf("\nenter marks of student: ");
	scanf("%d",&marks);
	result(marks);
	
	int num;
	printf("\nenter number to check divisibility:");
	scanf("%d",&num);
	divisible(num);
}
void triangle(int a,int b,int c)
{
	if(a==b&&b==c)
		printf("triangle is equilateral traingle");
	else if(a==b||a==c||b==c)
		printf("triangle is isoscles triangle ");
	else
		printf("trianle is scalene triangle");
}
void greatest(int a,int b,int c)
{
	if(a>b)
		if(a>c)
			printf("%d is greatest",a);
		else
			printf("%d is greatest",c);
	else
		if(b>c)
			printf("%d is greatest",b);
		else
			printf("%d is greatest",c);
}
void result(int a)
{
//	If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"
	if(a>=75)
		printf("Distinction");
	else if(a>=65)
		printf("First class");
	else if(a>=55)
		printf("second class");
	else if(a>=40)
		printf("Pass class");
	else 
		printf("Fail");
}
void divisible(int a)
{
//	Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None

    if(a%3==0&&a%5!=0)
     	printf("%d is Divisible by 3 but not by 5 ",a);
    else if(a%3!=0&&a%5==0)
     	printf("%d is Divisible by 5 but not by 3 ",a);
    else if(a%3==0&&a%5==0)
     	printf("%d is Divisible by both ",a);
    else
    	printf("%d is Divisible by None",a);
}













