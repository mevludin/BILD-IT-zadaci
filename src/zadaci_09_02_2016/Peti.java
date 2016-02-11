package zadaci_09_02_2016;

class MyStringBuilder1{
String s;

//  konstruktor sa argumentima
public MyStringBuilder1(String s){
	this.s = s;
}
// metoda za sabiranje stringova
public MyStringBuilder1 append(MyStringBuilder1 s){
	return new MyStringBuilder1(this.s += s.s);
}
// dodavanje broja na string
public MyStringBuilder1 append(int i){
	return new MyStringBuilder1(this.s += i);
}
// vraca duzinu stringa
 public int length(){
	 return this.s.length();
 }
 // vraća karakter na traženom indeksu
 public char charAt(int index){
	 return this.s.charAt(index);
 }
 // pretvara slova stringa u mala slova
 public MyStringBuilder1 toLowerCase(){
	 return new MyStringBuilder1(this.s.toLowerCase());
 }
 // vraća substring sa zadanim početnim i krajnjim indeksom
 public MyStringBuilder1 substring(int begin, int end){
	 String s = "";
	 for(int i = begin; i <= end; i++){
		 s += this.s.charAt(i);
	 }
	 return new MyStringBuilder1(s);
 }
// za vraæanje stringa
public String toString(){
	return this.s;
}
}

public class Peti {

}
