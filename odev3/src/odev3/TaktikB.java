//Mert ÇALIŞKAN g211210086
package odev3;

public class TaktikB extends Taktik{//savas sirasinda populasyon acisindan dusuk olan koloninin kullandigi taktik

	@Override
	int Savas() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * (1001-0)) + 0);//hala kazanma sansi vardir ama diger koloniye gore dusuk kazanma ihtimali vardir.
	}

}
