void main(){
	
	int mark1,mark2,mark3,mark4,mark5,total_marks;
	float percentage;
	mark1 = 95;
	mark2 = 76;
	mark3 = 92;
	mark4 = 85;
	mark5 = 90;
	
	printf("maximum marks of 5 subjects are 500");
	total_marks = mark1+mark2+mark3+mark4+mark5;
	
	percentage = (total_marks*100)/500;
	
	printf("\npercentage of marks of 5 subjects %d,%d,%d,%d,%d respectively is %.1f",mark1,mark2,mark3,mark4,mark5,percentage);
	
	
}