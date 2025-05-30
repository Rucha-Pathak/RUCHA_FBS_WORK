void main(){
	
	int m1,m2,m3,m4,m5,sum;
	float percentage;
	m1 = 86;
	m2 = 90;
	m3 = 92;
	m4 = 84;
	m5 = 80;
	printf("Marks of student are %d,%d,%d,%d,%d respectively out of 100 \n",m1,m2,m3,m4,m5);
	
	sum = (m1+m2+m3+m4+m5);
	percentage = (sum / 600)*100 ;
	printf("%f",percentage);
}