//Mert ÇALIŞKAN g211210086
package odev3;

public class Oyun {
	private int oyuncu;//oyuna katilan koloni sayi
	
	public Oyun(int oyuncu) {
		this.oyuncu=oyuncu;
	}
	void cizdir(Koloni[] koloniler, int tur) {
		if(tur==1)
			System.out.println("----------------------------------------------------------------");
		System.out.println("Tur Sayisi: "+ tur+"\nKoloni\t\tPopulasyon\tYemek Stogu\tKazanma\tKaybetme");
		for(int i =0;i<oyuncu;i++) {
			if(koloniler[i].populasyon==0)//koloninin yok olmasi durumu
				System.out.println(koloniler[i].sembol+"\t\t"+"--"+"\t\t"+"--"+"\t\t"+"--"+"\t"+"--");
			else
				System.out.println(koloniler[i].sembol+"\t\t"+koloniler[i].populasyon+"\t\t"+koloniler[i].yemekStok+"\t\t"+koloniler[i].kazanma+"\t"+koloniler[i].kaybetme);
				
		}
		System.out.println("\n----------------------------------------------------------------");
	}
}
