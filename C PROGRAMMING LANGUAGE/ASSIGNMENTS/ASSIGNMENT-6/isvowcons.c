//wap to check wheather vowel or consonnant 
void isvowelorcons();
void main()
{
	isvowelorcons();
}
void isvowelorcons()
{
	char c;
	printf("enter the character: ");
	scanf("%c",&c);
	
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U')
		printf("\n%c is vowel ",c);
	else
		printf("\n%c is consonant ",c);
}