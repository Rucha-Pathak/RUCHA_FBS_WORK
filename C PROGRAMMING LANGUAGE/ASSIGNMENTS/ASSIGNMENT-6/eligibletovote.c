void iseligible();
void main()
{
	iseligible();
}
void iseligible()
{
	int age;
	printf("Enter the age:");
	scanf("%d",&age);
	if(age>=18)
		printf("\nperson is eligible to vote");
	else
		printf("\npersong is not eligible to vote");
	
}