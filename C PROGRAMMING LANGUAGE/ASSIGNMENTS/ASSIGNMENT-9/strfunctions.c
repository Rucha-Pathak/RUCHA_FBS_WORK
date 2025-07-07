//strlen,strcpy,strcat,
void main()
{
	char name[50] = "Rucha";
	// 1) strlen(calculates length of string)
	printf("%d is length of string : ",strlen(name));

    char str1[50] = "Hello";
    char str2[50] = "world";
    // 2) strcat (it is used to concatenate strings)
    printf("\n%s is string" ,strcat(str1,str2));
    
    // 3) strcpy (it is used to copy one string to other 
    char str3[50];
    printf("\n%s is string : ",strcpy(str3,str2));
    
    char temp[50];
    // 4) strncpy (it is used to copy n characters)
    printf("\n%s is temp string ",strncpy(temp,name,2));
    
    // 5) strncat(it is used to concat n characters)
    printf("\n%s is string",strncat(str1,str2,3));
    
}