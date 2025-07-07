//strcmp(compare character of two strings until matched or\0 charactter
//it return 0 if equal ,>0 if first is greater ,<0 if second is greater
void main()
{
	char str1[50];
	char str2[50];
	printf("enter two strings: ");
	scanf("%s%s",&str1,&str2);
	int res = strcmp(str1,str2);
	printf("%d is result",res);
}