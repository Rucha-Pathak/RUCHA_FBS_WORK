// convert time in hr ,min, sec in total seconds

void main(){
	
	//int hr = 2, min = 15,sec= 30;
	int hr,min,sec,new_sec;
	printf("enter hr ,min, sec:");
	scanf("%d,%d,%d",&hr,&min,&sec);

	new_sec = (hr*60*60) + (min*60) + sec;
	
	printf("total seconds are %d", new_sec);
		
}