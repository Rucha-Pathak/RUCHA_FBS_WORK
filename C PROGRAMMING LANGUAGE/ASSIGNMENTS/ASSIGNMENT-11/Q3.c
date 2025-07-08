////WAP to Remove the nth Index Character from a Non-Empty String
void main()
{
	int size;char name[50];int i;
	printf("enter the size of string: ");
	scanf("%d",&size);
	printf("\nenter the string: ");
	scanf("%s",&name);
	printf("\n%s is string entered ",name);
	printf("\nenter the index to remove character: ");
	scanf("%d",&i);
	if(i<0||i>=size)
		printf("invalid index");
	else{
		for(int j=i;j<size;j++)
			name[j] =name[j+1];
	}
	printf("\n new string is %s",name);
}