void main(){
	
	int basic,da,ta,hra,total_salary;
	
	basic = 35000;
	
	if(basic<=5000){
		da= (10*basic)/100;
		ta= (20*basic)/100;
		hra= (25*basic)/100;
		
		total_salary = basic+da+ta+hra;
		printf("%d is total salary",total_salary);
	}
	else
	{
		da= (15*basic)/100;
		ta= (25*basic)/100;
		hra= (30*basic)/100;
		
		total_salary = basic+da+ta+hra;
		printf("%d is total salary",total_salary);
	}
	
	
	
}