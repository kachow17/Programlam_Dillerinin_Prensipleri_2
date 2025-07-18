//Mert ÇALIŞKAN g211210086
package odev3;

public class TaktikA extends Taktik{//savas sirasinda populasyon acisindan fazla olan koloninin kullandigi taktik

	@Override
	int Savas() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * (1001-500)) + 500);//populasyon ustunlugu goz ardi edilmez ve kazanma ihtimali artmasi icin rastgele deger 500 - 1000 arasi hesaplanir
	}

}
