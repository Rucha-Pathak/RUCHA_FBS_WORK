//wap to convert temp from cel to fahrenhit
void converttemp(float );
void main()
{
	float cel;
	printf("enter temp in cel: ");
	scanf("%f",&cel);
	converttemp(cel);
}
void converttemp(float c)
{
	float f = ((c*9)/5)+32;
	printf("\n%.2f celsius in fahrenhit is %.2f",c,f);
}