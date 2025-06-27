//wap to find perimeter of rectangle
void perimeter();
void main()
{
	perimeter();
}
void perimeter()
{
	int length,breadth;
	printf("enter length and breadth:");
	scanf("%d%d",&length,&breadth);
	int perimeter = 2*(length+breadth);
	printf("%d is perimeter of rectangle",perimeter);
}