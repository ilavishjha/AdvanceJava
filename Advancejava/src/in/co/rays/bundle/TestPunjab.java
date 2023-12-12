package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestPunjab {
	public static void main(String[] args) {
		Locale locale = new Locale("pa", "IN","Punjab");
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.punjabi", locale);
		System.out.println(rb.getString("punjab"));
}
}
