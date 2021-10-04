import java.util.*;

public class fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		
		System.out.print(c.get(Calendar.DAY_OF_MONTH));
		System.out.print("-");

		System.out.print(c.get(Calendar.MONTH)+1);
		System.out.print("-");
		System.out.println(c.get(Calendar.YEAR));
	}

}
