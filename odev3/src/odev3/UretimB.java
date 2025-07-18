//Mert ÇALIŞKAN g211210086
package odev3;

public class UretimB extends Uretim{

	@Override
	int Uret() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * (6-1)) + 1);//populasyonun az olmasi durumu icin uretim
	}
	
}
