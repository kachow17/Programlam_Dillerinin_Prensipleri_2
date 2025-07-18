//Mert ÇALIŞKAN g211210086
package odev3;

public class Koloni {
	char sembol;
	int populasyon;
	int yemekStok;
	int kazanma;
	int kaybetme;
	
	public Koloni(int populasyon, char sembol) {//ilk deger atamalari yapiilir
		this.populasyon=populasyon;
		this.sembol=sembol;
		yemekStok=populasyon*populasyon;
		kazanma=0;
		kaybetme=0;
	}
}
