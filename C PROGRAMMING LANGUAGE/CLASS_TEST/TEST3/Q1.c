//wap to print even and odd numbers in given range
void main() {
	int s,e;
	printf("enter the starting and ending :");
	scanf("%d%d",&s,&e);
	printf("\nstarting is %d ",s);
	printf("\nending is %d ",e);

	printf("\neven :  ");
	for(int i=s; i<=e; i++) {
		if(i%2==0) {
			printf("%d ",i);
		}

	}
	
	printf("\nodd  :  ");
	for(int i=s ; i<=e; i++) {
		if(i%2!=0) {

			printf("%d  ",i);
		}
	}
}