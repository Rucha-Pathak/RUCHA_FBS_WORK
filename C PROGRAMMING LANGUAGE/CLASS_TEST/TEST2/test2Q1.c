//WAP to calculate electricity bill
void main()
{
	int unit;
	printf("Enter unit :");
	scanf("%d",&unit);
	
	if(unit>=1 && unit<=50)
		printf("\n electricity bill for unit %d is %d",unit,30*unit);
	else if(unit>=51 && unit<=150)
		printf("\n electricity bill for unit %d is %d",unit,40*unit);
	else if(unit>=151)
		printf("\n electricity bill for unit %d is %d",unit,50*unit);
	else
		printf("\n unit is invalid ");	
}