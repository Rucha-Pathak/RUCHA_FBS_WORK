//strcat(used for concatenation of two strings)
void main()
{
	char str1[50];
	char str2[50];
	
	printf("enter two strings :");
	scanf("%s%s",&str1,&str2);
	printf("two strings are: %s and %s ",str1,str2);
	printf("\nconcatenation of two string : %s ",strcat(str1,str2));
	
}