//wap to create structure Time (hour, min, sec)
struct Time{
	int hour;
	int min;
	int sec;
};
void main()
{
	struct Time t;
	printf("enter time: ");
	printf("\nenter hour: ");
	scanf("%d",&t.hour);
	printf("enter min: ");
	scanf("%d",&t.min);
	printf("enter sec: ");
    scanf("%d",&t.sec);
    printf("Time is : %d:%d:%d i.e. %d hour %d min %d sec",t.hour,t.min,t.sec,t.hour,t.min,t.sec);
}