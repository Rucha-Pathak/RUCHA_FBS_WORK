//wap to find area of circle
void areaofcircle();
void main()
{
    areaofcircle();
}
void areaofcircle()
{
	int rad;
    printf("enter the radius:");
    scanf("%d",&rad);
    float area = 3.14*rad*rad;
    printf("\n%.2f is area of circle for %d radius",area,rad);
}