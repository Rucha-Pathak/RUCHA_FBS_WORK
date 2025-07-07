//strcpy(used to copy one string to other
void main()
{
	char str1[50];
	char str2[50];
	printf("enter two strings : ");
	scanf("%s%s",&str1,&str2);
	printf("\ntwo strings are: %s and %s",str1,str2);
	printf("\ncopy str2 in str1 : %s",strcpy(str1,str2));
	printf("\n%s",str1);
}