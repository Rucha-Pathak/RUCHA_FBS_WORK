void changetemp();
void main()
{
	changetemp();
}
void changetemp()
{
	float cel,f;
	printf("enter temperature in celsius:");
	scanf("%f",&cel);
	f= (cel*(9/5))+32;
	
	printf("%.2f is temperature in fahrenhit",f);
}