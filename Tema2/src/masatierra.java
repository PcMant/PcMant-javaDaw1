
public class masatierra {
	
	public static void main(String[] args) {
		
		double gravedad, masaTierra, radioTierra, laG;
		
		masaTierra = (double) (5.972*Math.pow(10,24));
		radioTierra = (double) (6371*Math.pow(10, 3));
		laG = (double) (6.674*Math.pow(10,-11));
		
		gravedad = (double) (laG*masaTierra/Math.pow(radioTierra, 2));
		
		System.out.println(gravedad);
		System.out.print(gravedad==9.81);
	}

}
