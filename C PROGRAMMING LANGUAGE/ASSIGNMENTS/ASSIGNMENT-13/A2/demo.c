//Time (hour, min, sec)
//8. Distance ( feet, inch)
//9. Complex (real, imaginary)
//10. Product (id, name, quantity, price)
struct Time storedetails();
struct Distance storedetails();
struct Complex storedetails();
struct Product storedetails();


void display(struct Time);
void display(struct Distance);
void display(struct Complex);
void display(struct Product);

struct Time{
	int hour;
	int min;
	int sec;
};
struct Distance{
	int feet;
	int inch;
};
struct Complex{
	int real;
	int img;
};
struct Product{
	int id;
	char name[20];
	int quantity;
	double price
};

void main()
{
	
	struct Time t1;
	printf("enter the details of Time: ");
	t1 = storedetails();
	printf("Details of Time are: ");
	display(t1);
	
	
	struct Distance d1;
	printf("enter the details of Distance: ");
	d1 = storedetails();
	printf("Details of Distance are: ");
	display(d1);
	
	
	struct student s1;
	printf("enter the details of student: ");
	s1 = storedetails();
	printf("Details of student are: ");
	display(s1);
	
	
	struct student s1;
	printf("enter the details of student: ");
	s1 = storedetails();
	printf("Details of student are: ");
	display(s1);
	
}


struct Time storedetails()
{
	struct Time temp;
	scanf("%d",&temp.hour);
	scanf("%d",temp.min);
	scanf("%d",&temp.sec);
	return temp;
}


struct Distance storedetails()
{
	struct Distance temp;
	scanf("%d",&temp.feet);
	scanf("%d",&temp.inch);
	return temp;
}


struct Complex storedetails()
{
	struct Complex temp;
	scanf("%d",&temp.real);
	scanf("%d",&temp.img);
	return temp;
}


struct Prduct storedetails()
{
	struct Product temp;
	scanf("%d",&temp.id);
	scanf("%s",temp.name);
	scanf("%d",&temp.quantity);
	scanf("%lf",&temp.price);
	return temp;
}


void display(struct Time t1)
{
	printf("\n%d:%d:%d",t1.hour,t1.min,t1.sec);
}


void display(struct Distance stud)
{
	printf("%d-%d",stud.feet,stud.inch);
}


void display(struct Complex stud)
{
	printf("%d + %d i",stud.real,stud.img);
}


void display(struct Product stud)
{
	printf("%d\n%s\n%d\n%.2lf",stud.id,stud.name,stud.quantity,stud.price);
}