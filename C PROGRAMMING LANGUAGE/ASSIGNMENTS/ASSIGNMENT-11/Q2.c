//wap to replace all a in string by $
void main()
{
	char name[50];
	int size;
	printf("enter the size of string");
	scanf("%d",&size);
	printf("enter the string: ");
    scanf("%s",&name);
	for(int i=0;i<size;i++)
	{
		if(name[i]=='a')
			name[i] = '$';
	}	
	printf("new string will be %s",name);
}