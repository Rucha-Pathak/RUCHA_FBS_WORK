//wap to create structure Complex (real, imaginary)
struct complex{
	int real;
	int imaginary;
};
void main()
{
	struct complex c;
	printf("enter real and imaginary part : ");
	scanf("%d%d",&c.real,&c.imaginary);
	printf("\ncomplex number is : \"%d + %di\" ",c.real,c.imaginary);
}