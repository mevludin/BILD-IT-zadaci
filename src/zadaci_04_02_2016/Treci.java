package zadaci_04_02_2016;

public class Treci {

	
		private long pocetak;
		private long kraj;

		public Treci() {

			pocetak = System.currentTimeMillis();
		}

		// geteri i seteri
		public double getPocetak() {

			return pocetak = System.currentTimeMillis();
		}
		public void setPocetak(long startTime) {
			setPocetak(System.currentTimeMillis());//koristimo metod currentTimeMillis()
			this.pocetak = pocetak;
		}

		public double getKraj() {
			return kraj = System.currentTimeMillis();
		}

		public void setKraj(long kraj) {
			setKraj(System.currentTimeMillis());
			this.kraj = kraj;
		}

		//poèetak
		public void start(long pocetak) {
			setPocetak(System.currentTimeMillis());
		}

		//kraj
		public void stop(long kraj) {
			setKraj(System.currentTimeMillis());

		}

		//proteklo vrijeme
		public long getProtekloVrijeme() {
			long protekloVrijeme = kraj - pocetak;
			return protekloVrijeme;
	}

}
