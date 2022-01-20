package ErzurumAtaturkUniversitesiApi.AtaturkUniversitesi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DersVeriServisi {

	/* Dersler adında bir liste oluşturup içerisine elle ders ekledim
	 * */
	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Yazilim Test Otomasyon","Test Senaryolari","5","B106"));
		DERSLER.add(new Ders("Yazilim Ortam Araclari","Yazilim Araclari Hakkinda Bilgi","5","C204"));
		DERSLER.add(new Ders("C# Uygulamalari","C# ile Kutuphane Yonetim Sistemi","5","B305"));
		DERSLER.add(new Ders("Mobil Yazilimlar","Mobil Uygulama Geliştirme","7","C252"));
		DERSLER.add(new Ders("Yonlendirilmis Calisma","Analiz","3","B241"));	
		
	}
	/*Burada ise dersleri return eden bir fonksiyon oluşturdum*/
	
	public static List<Ders>dersleriGetir(){
		
		return DERSLER;
		
	}
	/*Burada ise ders ekleyen eden bir fonksiyon oluşturdum*/
	public static void dersEkle(Ders ders){
		
		DERSLER.add(ders);
		
	}
	/*Burada ise silinecek olan dersi sınıfnumarasından eşitleme yapıp silen bir fonksiyon olusturdum */
	public static void dersSil(Ders ders) {
		for (Iterator<Ders> iter = DERSLER.listIterator(); iter.hasNext(); ) {
			Ders a =iter.next();
		    if (a.getDersSinifNumarasi().equals(ders.getDersSinifNumarasi())) {
		       iter.remove();
		       return;
		    }
		}
		
		
	}
	
	
	
}
