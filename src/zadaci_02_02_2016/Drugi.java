package zadaci_02_02_2016;

public class Drugi {
	public static int getRandom(int[] numbers){
		int nasum=(int)(Math.random()*55);
		//provjerava broj
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == nasum){
				nasum = (int)(Math.random()*55);
				//ponovo pretrazi niz
				i = 0;
			}
		}
		//vraca slucajan broj
		return nasum;
	}
	public static void main(String[] args) {
		int [] numbers=new int [10];
		System.out.println("Niz brojeva: ");
		for (int i=0;i<numbers.length;i++){
			numbers[i]=(int)(Math.random()*55);
			System.out.print(numbers[i]+",");
		}
		System.out.println("\nNasumièan broj razlièit od niza je : "+getRandom(numbers));

	}

}
