void main(){
	
	int s1,s2,s3;
	printf("enter three sides of traingle: ");
	scanf("%d %d %d",&s1,&s2,&s3);
	
	if(s1==s2 && s2==s3 )
		printf("It is equilateral traingle");
	else if(s1==s2 || s2==s3 ||s1==s3)
		printf("It is isosceles traingle");
	else
		printf("It is scalene traingle");
}