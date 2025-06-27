//wap to calculate are of traingle
void areaoftriangle();
void main()
{
	areaoftriangle();
}
void areaoftriangle()
{
	int base,height;
	printf("enter base and height:");
	scanf("%d%d",&base,&height);
    float area = 0.5*base*height;
    printf("area of traingle is %.2f",area);
}