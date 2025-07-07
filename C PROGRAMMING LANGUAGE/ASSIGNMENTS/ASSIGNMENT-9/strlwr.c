//strlwr(function used to convert string into lowercase
void main()
{
	char name[50];
	printf("enter string: ");
	scanf("%s",&name);
	printf("\n%s is string",name);
	printf("\n%s in lowercase is %s",name,strlwr(name));
}