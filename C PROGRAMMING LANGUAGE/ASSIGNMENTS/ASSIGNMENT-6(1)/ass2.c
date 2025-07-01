//Write a program to check whether a number is even or odd.
//2. Write a program to check given 3 digit number is pallindrome or not.
//3. Write a program to check whether a given year is a leap year.
//4. Write a program to check whether a given character is a vowel or consonant.
//5. Write a program to check whether a person is eligible to vote (age = 18).
//6. Write a program to check whether a given character is uppercase or lowercase.
//7. Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.

void isevenodd(int);
void isleap(int);
void ispalindrome(int);
void isvowelorcons(char);
void votingage(int);
void isupperlower(char);
void totalsalary(double);
void main()
{
	char ch,alpha;
	printf("Enter character to check vowel or not: ");
	scanf(" %c",&ch);
	isvowelorcons(ch);
	
	printf("\nEnter the character to check upper or lowercase:");
	scanf(" %c",&alpha);
	isupperlower(alpha);
	
	int n1,year,num,age;
	double salary;
	
	printf("\nEnter number to check even or odd: ");
	scanf("%d",&n1);
	isevenodd(n1);
	
	printf("\nEnter the year to check leap or not : ");
	scanf("%d",&year);
	isleap(year);
	
	printf("\nenter number to check palindrome or not: ");
	scanf("%d",&num);
	ispalindrome(num);
	
	printf("\nenter the age: ");
	scanf("%d",&age);
	votingage(age);
	
	printf("\nEnter the basic salary to calculate total salary: ");
	scanf("%lf",&salary);
	totalsalary(salary);
	
}
void isevenodd(int a)
{
	if(a%2==0)
		printf("%d is even",a);
    else
    	printf("%d is odd",a);
}
void isleap(int y)
{
	if(y%4==0&&y%100!=0||y%400==0)
		printf("%d is leap year",y);
	else
		printf("%d is not leap year",y);
}
void ispalindrome(int n)
{
	int rev=0,rem,temp = n;
	while(n>0)
	{
		rem = n%10;
		rev = rev*10+rem;
		n/=10;
	}
	if(rev==temp)
		printf("%d is palindrome",temp);
	else
		printf("%d is not palindrome",temp);
}
void isvowelorcons(char c)
{
	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		printf("%c is vowel ",c);
	else
		printf("%c is consonant ",c);
}
void votingage(int a)
{
	if(a>=18)
		printf("%d age  is eligible to vote",a);
	else
		printf("%d age  is not eligible to vote",a);
}
void isupperlower(char alpha)
{
	if(alpha>='A'&& alpha<='Z')
		printf("%c is uppercase ",alpha);
	else if(alpha>='a'&& alpha<='z')
		printf("%c is lowercase ",alpha);
	else
		printf("invalid alphabet ");
}
void totalsalary(double sal)
{
	double da,ta,hra,totalsalary;
	
	if(sal<=5000)
	{
		da = 0.10*sal;
		ta = 0.20*sal;
		hra = 0.25*sal;
		totalsalary = sal+da+ta+hra;
		printf("%.2lf is total salary",totalsalary);
	}
	else
	{
		da = 0.15*sal;
		ta = 0.25*sal;
		hra = 0.30*sal;
		totalsalary = sal+da+ta+hra;
		printf("%.2lf is total salary",totalsalary);
	}
}






