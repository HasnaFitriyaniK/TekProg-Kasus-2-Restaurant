package w4StudiKasus2;

public class Penjualan {
	
	private Produk[] item; //deklarasi variable
	private static byte id=0; //membuat index
	
	public Penjualan () { //membuat objek
		item = new Produk[10]; //membuat array yang mengandung makanan, stok, dan harga makanannya
		for (int i=0; i<item.length; i++)
				item[i] = new Produk();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) { //procedure untuk  input a new food to the list(menu)
		item[id].setNama_makanan(nama);
		item[id].setHarga_makanan(harga);
		item[id].setStok(stok);
	}
	
	public void tampilMenuMakanan(){ //procedure to show the list(menu)
		System.out.println("           RESTAURANT MENU");
		System.out.println("=====================================");
		for(int i =0; i<item.length; i++){
			if(!isOutOfStock(i,1))
				System.out.println((i+1) +"." +item[i].getNama_makanan() +"["+item[i].getStok()+"]"+"\tRp. "+item[i].getHarga_makanan());
		}
	}
	
	public boolean isOutOfStock(int id, int qty){ //to check if the food we have the stock regarding the demand from the customer
		if(item[id].getStok() < qty){
			return true;
		}
		else{
			return false;
		}
	}

	public double getHarga(int idx) { //accessor
		return item[idx].getHarga_makanan();
	}
	
	public int getStok(int qty) { //accessor
		return item[qty].getStok();
	}
	
	public void reduceStock(int id, int qty) { //reduce the food stock if customer buy the food
		if (isOutOfStock(id, qty) == false){
			item[id].setStok(item[id].getStok() - qty); 
		}
	}
	
	public static void nextId(){ //to get to the next index
		id++;
	}
}
