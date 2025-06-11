void main(){
	
	double price ,tp;
	char is_student;
	
	printf("Is he student :");
	scanf("%c",&is_student);
	
	printf("Enter the price: ");
	scanf("%lf",&price);
	
	if(is_student == 'y'){
		if(price>500){
			tp = price-(price*0.20);
			printf("total price is %.2lf",tp);
		}
		else{
			tp = price-price*0.10;
			printf("\ntotal price is %.2slf",tp);
		}
	}
	else{
		if(price>600){
			tp = price-price*0.15;
			printf("\ntotal price is %.2lf",tp);
		}
		else{
			tp = price;
			printf("\ntotal price is %.2lf",tp);
		}
	}
	
	
}