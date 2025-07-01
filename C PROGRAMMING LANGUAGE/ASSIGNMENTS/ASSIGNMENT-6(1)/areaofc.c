//wap to find area of circle
void areaofcircle(float);
void main()
{
	float radius;
	printf("enter the radius of circle: ");
	scanf("%f",&radius);
	areaofcircle(radius);
}
void areaofcircle(float r)
{
	float area = 3.14*r*r;
	printf("\n%.2f is area of circle with radius %.2f",area,r);
}