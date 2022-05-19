package ejercicio111213;

import java.io.Serializable;
import java.util.List;

public class Punto implements Serializable {
//ejercicio 11 
		int coordX;
		int coordY;
		String color;
		
		//constructor
		public Punto( int x, int y, String color) {
			try {
			setCoordX( coordX);
			setCoordY( coordY);
			setColor( color);
			}catch(Exception e) {
				
			}
			
		}

		
		//getter and setter
		public int getCoordX() {
			return coordX;
		}

		private void setCoordX(int coordX) {
			this.coordX = coordX;
		}

		public int getCoordY() {
			return coordY;
		}

		private void setCoordY(int coordY) {
			this.coordY = coordY;
		}
		
		public String getColor() {
			return color;
		}

		private void setColor(String color) {
			this.color = color;
		}
		
		
		public String toSting() {
			return String.format("Coordenada X: %.2f %n Coordenada Y: %.2f %n Color: %s", null);
		}
		
		
		
		
		
	
		
}
