package zadaca_10_02_2016;

public class GeometricObject {
	//data fields
	private String color = "white";
	private boolean filled;
	//getters and setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		}
	public boolean isFilled() {
		return filled;
		}
	public void setFilled(boolean filled) {
		this.filled = filled;
		}
	//to string
	public String toString() {
		return "\ncolor: " + color +
		" and filled: " + filled;
		}

}
