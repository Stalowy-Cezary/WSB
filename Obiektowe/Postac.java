public class Postac {
	int zdrowie;
	int atak;
	Postac(int zdrowie, int atak){
		this.zdrowie = zdrowie;
		this.atak = atak;
	}
}
	class Elf extends Postac{
		float zwinnosc;
		Elf(int zdrowie, int atak, int zwinnosc){
			super(zdrowie, atak);
			this.zwinnosc = zwinnosc;
		}
}


	