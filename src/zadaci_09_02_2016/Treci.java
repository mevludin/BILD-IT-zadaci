package zadaci_09_02_2016;
class MyCharacter{ 
	 char karakter;
	
	//konstruktor sa arg karakter

//metoda za dodjeljivanje karaktera varijabli karakter
private void setInputChar( char ch )
{
	karakter = ch;
}

public MyCharacter(char ch) {
		this.karakter = ch;
	}

//poziv varijable karakter
private char getChar()
{
	return karakter;
}
//provjerava je li karakter slovo
private boolean isLetter()
{
	if ( karakter > 64 && karakter < 91 || 
			karakter > 96 && karakter < 123 )
		{
		return true;
		}
	return false;
}
//provjerava je li krakter broj
private boolean isDigit()
{
	if ( karakter > 47 && karakter < 58 )
	{
		return true;
	}
	return false;
}
//poredi karaktere
private boolean equals ( char ch )
{
	if ( karakter == ch )
	{
		return true;
	}
	return false;
}


}
public class Treci {
	
	public static void main(String[] args) {
		//test
		
		MyCharacter ch = new MyCharacter( 'M' );
       
        System.out.println( "M == L  " + ch.equals( 'L' ) );

	}

}
