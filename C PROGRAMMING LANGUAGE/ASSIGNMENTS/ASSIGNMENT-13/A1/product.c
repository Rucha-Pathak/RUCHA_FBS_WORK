//wap to create structure Product (id, name, quantity, price)
struct Product{
	int id;
	char name[20];
	int quantity;
	int price;
};
void main()
{
	struct Product p;
	printf("Enter details of product: ");
	printf("\n enter id , name , quantity , price");
	scanf("%d%s%d%d",&p.id,p.name,&p.quantity,&p.price);
	printf("\ndetails are : %d\t%s\t%d\t%d",p.id,p.name,p.quantity,p.price);
}