//Write a program to scan string from user then scan a single character and search it
//in a accepted string.
void main()
{
	char name[50];
	int size;
	printf("enter size of string: ");
	scanf("%d",&size);
	printf("\nenter the string: ");
	scanf("%s",&name);
	printf("string entered is %s",name);
	char c;
	printf("\nenter the  character: ");
	scanf(" %c",&c);
	for(int i=0;i<size;i++)
	{
		if(c == name[i])
			printf("%c found at %d index",c,i);
	}
}