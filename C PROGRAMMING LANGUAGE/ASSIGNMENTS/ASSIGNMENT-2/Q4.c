void main() {
	int marks;
	printf("enter the marks: ");
	scanf("%d",&marks);
	if(marks>75)
		printf("Distinction");
	else {
		if(marks>65)
			printf("First class");
		else {
			if(marks>55)
				printf("Second class");
			else {
				if(marks>40)
					printf("Pass class");
				else
					printf("Fail");
			}
		}
	}
}