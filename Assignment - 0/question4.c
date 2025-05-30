void main(){
	
	int area , length , breadth,newarea,areaoftile,no_of_tiles;
	length = 12;
	printf("length of tile is %d sq cm\n", length);
	breadth = 12;
	printf("breadth of tile is %d sq cm\n",breadth);
	area = 144;
	printf("area of room is %d sq m\n",area);
	printf("let's convert area to sq cm\n");
	
	newarea = area*100*100;
	printf("newarea is %d\n",newarea);
	
	areaoftile = length*breadth;
	printf("areaoftile is %d\n",areaoftile);
	
	printf("no of tiles is area of room divided by area of tile \n");
	no_of_tiles = (newarea/areaoftile);
	
	printf("no of tiles required is %d",no_of_tiles);
	
	
	
	
	
	
	
	
}