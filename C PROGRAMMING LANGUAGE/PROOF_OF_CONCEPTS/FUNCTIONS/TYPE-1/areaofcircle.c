void areaofcircle();
void main()
{
	areaofcircle();
}
void areaofcircle()
{
	float radius;
	printf("enter the radius:");
	scanf("%f",&radius);
	float area= 3.14*radius*radius;
	printf("\n%.2f is area of circle",area);
}