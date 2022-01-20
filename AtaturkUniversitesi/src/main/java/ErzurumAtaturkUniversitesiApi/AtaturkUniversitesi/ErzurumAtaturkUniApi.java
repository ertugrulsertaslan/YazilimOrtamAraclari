package ErzurumAtaturkUniversitesiApi.AtaturkUniversitesi;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/* http:localhost:8080/Ders Sayfası açılır*/
@RestController
@RequestMapping("/Ders")
public class ErzurumAtaturkUniApi {
	
	/* http:localhost:8080/Ders/listele Sayfası açılır
	 * Devamında dersVeriservisi clasıından dersleri getir fonksiyonu ile
	 * listeleriz 
	 * */
	@GetMapping("/listele")
	public List<Ders> listele(){
		
		return DersVeriServisi.dersleriGetir();
	}
	
	
	/* http:localhost:8080/Ders/ekle Sayfası açılır
	 * Devamında dersveriservisi classımızdan ders ekle fonksiyonu ile 
	 * ders ekleyip eklenen dersi tekrar return ederiz 
	 * */
	@PostMapping("/ekle")
	public Ders Ekle(@RequestBody Ders ders) {
		
		DersVeriServisi.dersEkle(ders);
		return ders;
		
	}
			
	/* http:localhost:8080/Ders/sil Sayfası açılır
	 * Devamında dersveriservisi classımızdan ders sil fonksiyonu ile 
	 * ders silip silinen dersi tekrar return ederiz 
	 * */	
	@DeleteMapping("/sil")
	public Ders sil(@RequestBody Ders ders) {
		
		DersVeriServisi.dersSil(ders);
		return ders;
		
	}

}
