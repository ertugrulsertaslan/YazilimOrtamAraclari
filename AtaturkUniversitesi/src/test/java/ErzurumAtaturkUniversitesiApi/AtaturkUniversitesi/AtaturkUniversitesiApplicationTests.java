package ErzurumAtaturkUniversitesiApi.AtaturkUniversitesi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class AtaturkUniversitesiApplicationTests {

	/* Listelemeyi test etmek için öncelikle dersleri getir methodunun size
	 * ile kaç tane dersimiz olduğunu buluyoruz sonrasında ise bulduğumuz değer
	 * 5 e esit olmalı çünkü 6 tane dersimiz var testi çalıştırdığımızda sil komutu
	 * çalıştığı için 5 e düşüyor ve toplamda 5 dersimiz olmuş oluyor bu sebeple 
	 * çıktı 5 e eşit olmalı ve test basarılı oluyor
	 *  */
	@Test
	public void testlistele() {
		
		DersVeriServisi.dersleriGetir().size();
		assertEquals(DersVeriServisi.dersleriGetir().size(),5);
	
	}
	/* Eklemeyi test etmek için öncelikle dersleri getir methodunun size
	 * ile kaç tane dersimiz olduğunu buluyoruz sonrasında ise bulunan değeri
	 * ilkdersSayisi adında bir değişkene atıyoruz devamında ise bir yeni ders ekliyoruz
	 * ve altında dersEkle fonksiyonumuzla eklemiş oluyoruz 
	 * sonrasında ders ekledikten sonra tekrar ders sayısını bulup sonDersSayisi değişkenine atıyoruz
	 * sonrasında ise sonDersSayisindan ilk ders sayisini çıkarınca 1 çıkması gerekmektedir
	 * çünkü 1 ders daha ekledik ve sonDersSayisi ilkDerSayindan çıkarıldığında sonuc çıktıya eşit oluyor
	 * ve test başarılı oluyor
	 *  */
	@Test
	public void testEkle() {
		int ilkDersSayisi = DersVeriServisi.dersleriGetir().size();
		Ders denemeDers= new Ders("Calisma","Uygulama Geliştirme","3","C252");
		DersVeriServisi.dersEkle(denemeDers);
		int sonDersSayisi = DersVeriServisi.dersleriGetir().size();
		assertEquals(1,(sonDersSayisi-ilkDersSayisi));
	}
	/* Silmeyi test etmek için öncelikle dersleri getir methodunun size
	 * ile kaç tane dersimiz olduğunu buluyoruz sonrasında ise bulunan değeri
	 * ilkdersSayisi adında bir değişkene atıyoruz devamında ise dersSil fonksiyonumuzla dersi siliyoruz 
	 * sonra tekrar ders sayısını bulup sonDersSayisi değişkenine atıyoruz
	 * sonrasında ise ilkDersSayisindan sonDersSayisini çıkarınca 1 çıkması gerekmektedir
	 * çünkü 1 ders sildik ve ilkDersSayisi sonDersSayindan çıkarıldığında sonuc çıktıya eşit oluyor
	 * ve test başarılı oluyor
	 *  */
	@Test
	public void testSil() {
		int ilkDersSayisi = DersVeriServisi.dersleriGetir().size();
		Ders MobilYazilimlar= new Ders("Mobil Yazilimlar","Mobil Uygulama Geliştirme","7","C252");
		DersVeriServisi.dersSil(MobilYazilimlar);
		int sonDersSayisi = DersVeriServisi.dersleriGetir().size();
		assertEquals(1,(ilkDersSayisi-sonDersSayisi));
	}

}
