//Mert ÇALIŞKAN g211210086
package odev3;

public class Savastir extends Taktik{
	private Koloni[] k1;
	private int koloniSayi;
	private int koloniGuc1;
	private int koloniGuc2;
	
	public Savastir(Koloni[] k1,int koloniSayi) {
		this.k1=k1;
		this.koloniSayi=koloniSayi;
	}
	
	
	@Override
	int Savas() {
		// TODO Auto-generated method stub
		int sonlandir=1;
		int tur = 1;
		TaktikA taktik1 = new TaktikA();
		TaktikB taktik2 = new TaktikB();
		UretimA uretim1= new UretimA();
		UretimB uretim2=new UretimB();
		Oyun oyun = new Oyun(koloniSayi);
        while(sonlandir!=0) {//bir koloni hayatta kalana kadar devam edecek olan dongu
        	sonlandir=koloniSayi-1;
        	for(int i=0;i<koloniSayi-1;i++) {
        		if(k1[i].populasyon!=0) {
        			for(int j = i+1;j<koloniSayi;j++) {
            			if(k1[j].populasyon!=0) {
            				if(k1[i].populasyon>k1[j].populasyon) {
            					koloniGuc1=taktik1.Savas();
            					koloniGuc2=taktik2.Savas();            					
            				}
            				else {
            					koloniGuc1=taktik2.Savas();
            					koloniGuc2=taktik1.Savas(); 
            				}
            				
            				int kazanan=0;
            				if(koloniGuc1==koloniGuc2) {
            					kazanan = (int) ((Math.random() * (3-1)) + 1);
            				}
            				else if(koloniGuc1>koloniGuc2 || kazanan==1) {
            					k1[i].kazanma=k1[i].kazanma+1;
            					k1[j].kaybetme=k1[j].kaybetme+1;
            					int oran = (int)(((koloniGuc1-koloniGuc2)*100)/1000);
            					k1[j].populasyon=k1[j].populasyon-(k1[j].populasyon*oran)/100;
            					if(k1[j].populasyon<0)
            						k1[j].populasyon=0;
            					k1[i].yemekStok=k1[i].yemekStok+(k1[j].yemekStok*oran)/100;
            					k1[j].yemekStok=k1[j].yemekStok-(k1[j].yemekStok*oran)/100;
            				}
            				else if(koloniGuc1<koloniGuc2 || kazanan==2) {
            					k1[j].kazanma=k1[j].kazanma+1;
            					k1[i].kaybetme=k1[i].kaybetme+1;
            					int oran = (int)(((koloniGuc2-koloniGuc1)*100)/1000);
            					k1[i].populasyon=k1[i].populasyon-(k1[i].populasyon*oran)/100;
            					if(k1[i].populasyon<0)
            						k1[i].populasyon=0;
            					k1[j].yemekStok=k1[j].yemekStok+(k1[i].yemekStok*oran)/100;
            					k1[i].yemekStok=k1[i].yemekStok-(k1[i].yemekStok*oran)/100;
            				}
            			}
            		}
        		}
        	}
        	for(int i=0;i<koloniSayi;i++) {
            	k1[i].populasyon=k1[i].populasyon + (k1[i].populasyon*20)/100;
            	k1[i].yemekStok=k1[i].yemekStok-k1[i].populasyon*2;
            	if(k1[i].populasyon>10) {
            		k1[i].yemekStok = k1[i].yemekStok + uretim2.Uret();
            	}
            	else if(k1[i].populasyon<=11 && k1[i].populasyon>0) {
            		k1[i].yemekStok=k1[i].yemekStok+uretim2.Uret();
            	}
            	if(k1[i].yemekStok==0 || k1[i].yemekStok<0 || k1[i].populasyon==1)
            		k1[i].populasyon=0;
        		if(k1[i].populasyon==0)
        			sonlandir--;
        	}
        	oyun.cizdir(k1, tur);
        	tur++;
        }
		return 0;
	}

}
