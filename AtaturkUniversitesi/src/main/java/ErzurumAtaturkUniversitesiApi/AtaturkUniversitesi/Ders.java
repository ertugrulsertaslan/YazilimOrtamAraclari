package ErzurumAtaturkUniversitesiApi.AtaturkUniversitesi;

public class Ders {

	/* Bu sayfada ise Derslerimizin özelliklerini tanımlarız sonrasında */
	private String DersAdi;
	private String DersAciklama;
	private String DersKredisi;
	private String DersSinifNumarasi;
	
	/* constructor aracılığıyla ogrenci alanlarını olusturma sırasında gönderiyoruz view anında bu bilgileri göndermek icin olusturuyoruz  */
	public Ders(String dersAdi, String dersAciklama, String dersKredisi, String dersSinifNumarasi) {
		super();
		DersAdi = dersAdi;
		DersAciklama = dersAciklama;
		DersKredisi = dersKredisi;
		DersSinifNumarasi = dersSinifNumarasi;
	}
	
	/* öncelikle private olarak tanımladığımız özellikleri Listelerken geriye dönmesi için getterlarını oluşturuyoruz  */
	public String getDersAdi() {
		return DersAdi;
	}
	public String getDersAciklama() {
		return DersAciklama;
	}
	public String getDersKredisi() {
		return DersKredisi;
	}
	public String getDersSinifNumarasi() {
		return DersSinifNumarasi;
	}
	
}
