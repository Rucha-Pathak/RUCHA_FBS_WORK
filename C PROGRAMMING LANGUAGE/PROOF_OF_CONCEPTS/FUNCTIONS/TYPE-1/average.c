//wap to find average of 5 numbers
void average();
void main()
{
	average();
}
void average()
{
	int n1,n2,n3,n4,n5;
	printf("enter the 5 numbers:");
	scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
	int avg;
	
	avg = (n1+n2+n3+n4+n5)/5;
	printf("%d is average of 5 numbers",avg);
}