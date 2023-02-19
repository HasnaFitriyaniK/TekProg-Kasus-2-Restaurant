package w4StudiKasus2;

public class Produk {
	
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Produk() {}
	
	//accessor (getter)
	public String getNama_makanan() {
		return nama_makanan;
	}
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public int getStok() {
		return stok;
	}
	
	//mutator (setter)
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
}
