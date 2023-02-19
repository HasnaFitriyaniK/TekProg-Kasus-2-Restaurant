package w4StudiKasus2;

import java.util.*;

public class Utama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Penjualan menu = new Penjualan(); //create object from Penjualan (class)
		
		//Input food menu
		System.out.println("       WELCOME TO HASNA'S CAFE");
		System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~");
		menu.tambahMenuMakanan("Batagor           ", 5_000, 1);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Roti Bakar        ", 12_000, 2);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Indomie Telor     ", 10_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Kwetiaw           ", 12_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Nasi Goreng       ", 12_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Air Mineral       ", 3_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Teh Manis         ", 4_000, 2);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Jus Alpukat       ", 8_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Teh Botol         ", 5_000, 3);
		Penjualan.nextId();
		menu.tambahMenuMakanan("Kopi             ", 3_000, 3);
		Penjualan.nextId();
		
		boolean takeOrder = true; //variable ini menunjukan order status dari user
		double price = 0; //varible untuk jumlah harga yang harus user bayar
		
		while (takeOrder == true){ //ini akan mengulang sampai user stop ordering menu
			menu.tampilMenuMakanan(); //ini menunjukan menu makananya
			System.out.println("--------------------------------------");
			System.out.println("Place your order here");
			System.out.print("Menu number: ");
			int idx = input.nextInt(); //ini mengambil input dari user regarding mau menu mana yang dipesan
			
			System.out.print("How much do you want it: "); 
			int qty = input.nextInt(); //mengambil input user regarding seberapa banyak yang mau dipesan
			if (menu.isOutOfStock(idx-1, qty)) { //kalau ini berarti itemnya abis stoknya
				System.out.println("Please adjust your order according to our available menu and stock\n");
				continue; //continue ini akan melanjutkan ke iterasi menu.tampilMenuMakanan untuk ditampilkan
			}
			else
				menu.reduceStock(idx-1, qty); //kalau user beli makanannya, ini akan mengurangi stoknya 		
			price = price + (menu.getHarga(idx-1)*qty); //menjumlahkan semua harganya dari apa yang user sudah beli
			System.out.print("The total amount you have to pay: " + price + "\n");
			
			//ini untuk melooping apakah user mau beli lagi atau tidak
			System.out.print("Do you want to order another food?(Yes/No)");
			String orderStatus = input.next(); //mengambil inputan apakah user mau beli lagi atau tidak
			if (orderStatus.compareToIgnoreCase("yes") == 0)
				takeOrder = true;
			else 
				takeOrder = false;
			}
	}

}
