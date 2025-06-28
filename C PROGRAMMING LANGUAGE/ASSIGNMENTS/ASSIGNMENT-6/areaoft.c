//wap to find area of triangle 
void areaoftraingle();
void main()
{
	areaoftraingle();
}
void areaoftraingle()
{
	int base,height;
	printf("enter the base and height of traingle:");
	scanf("%d%d",&base,&height);
	float area = 0.5*base*height;
	printf("\n%.2f is area of triangle",area);
}