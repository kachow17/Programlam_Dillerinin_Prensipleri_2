//Mert ÇALIŞKAN g211210086
package odev3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	
	public static char RastgeleSembol() {
	    return (char)((int) ((Math.random() * (126-33)) + 33));//ascii tablosundan 33 - 125 arasi karakterlerden rastgele karakter dondurulur
	}
	
	public static void main(String[] args) 
			throws IOException
	{
		//12 8 162 35 7 95
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Sayilari gir: ");
		String metin = reader.readLine();
		String[] numbersArray = metin.split(" ");//girilen metin sayilara ayrilip diziye atanir
        
        Koloni[] koloniler = new Koloni[numbersArray.length];//olusturulan koloniler tutulacagi dizi
        char[] semboller = new char[numbersArray.length];
        
        for (int i = 0; i < numbersArray.length; i++) {//benzersiz sembol uretimi
        	if(i!=0) {
        		boolean kontrol;
        		do {
        			kontrol = false;
        			semboller[i]=RastgeleSembol();
        			for(int j = 0; j<i;j++) {
        				if(semboller[i]==semboller[j]) {
        					kontrol = true;
        				}
        			}
        		}while(kontrol==true);
        	}
        	else
        		semboller[i]=RastgeleSembol();
        	
            Koloni k = new Koloni(Integer.parseInt(numbersArray[i]), semboller[i]);//sirasiyla populasyon degeriyle koloni nesnesi uretilir
            koloniler[i]=k;//olusturulan koloniler diziye atanir
        }
        Savastir savastir = new Savastir(koloniler,numbersArray.length);
        savastir.Savas();
        metin = reader.readLine();
	}
	
}
