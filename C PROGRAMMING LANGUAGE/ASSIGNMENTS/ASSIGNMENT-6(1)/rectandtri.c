//wap to find area and perimeter of rectangle and area of traingle
void areaofrect(int ,int);
void perimeterofrect(int, int);
void areaoftri(int ,int);
void main()
{
	int length ,breadth,base,height;
	printf("Enter length,breadth,base,height: ");
	scanf("%d%d%d%d",&length,&breadth,&base,&height);
	printf("\n%d %d %d %d ",length,breadth,base,height);
	areaofrect(length,breadth);
	perimeterofrect(length,breadth);
	areaoftri(base,height);
}
void areaofrect(int l,int b)
{
	printf("\n%d is area of rectangle with %d length and %d breadth",l*b,l,b);
	
}
void perimeterofrect(int l, int b)
{
	printf("\n%d is perimeter of rectangle with %d length and %d breadth",2*(l+b),l,b);
}
void areaoftri(int b,int h)
{
	printf("\n%f is area of triangle", 0.5*b*h);
}