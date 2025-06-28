void basicless();
void basicmore();
void main()
{
		basicless();
		basicmore();
}
void basicless()
{
	float salary,da,ta,hra,total_salary;
	printf("Enter the salary less than or equal to 5000: ");
    scanf("%f",&salary);
    printf("\n%.2f is salary",salary);
    da = 0.10*salary;
    printf("\n%.2f is da ",da);
    ta = 0.20*salary;
    printf("\n%.2f is ta ",ta);
    hra = 0.25*salary;
    printf("\n%.2f is hra ",hra);
    total_salary = salary+da+ta+hra;
    printf("\n%.2f is total salary",total_salary);   
}
void basicmore()
{
	float salary,da,ta,hra,total_salary;
	printf("\nEnter the salary more than 5000: ");
    scanf("%f",&salary);
    printf("\n%.2f is salary ",salary);
    da = 0.15*salary;
    printf("\n%.2f is salary ",da);
    ta = 0.25*salary;
    printf("\n%.2f is salary ",ta);
    hra = 0.3*salary;
    printf("\n%.2f is salary ",hra);
    total_salary = salary+da+ta+hra;
    printf("\n%.2f is total salary",total_salary);   
}