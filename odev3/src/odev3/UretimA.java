//Mert ÇALIŞKAN g211210086
package odev3;

public class UretimA extends Uretim{

	@Override
	int Uret() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * (11-5)) + 5);//yuksek populasyon icin uretim
	}

}
