package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLLocale {

	public static void main(String[] args) {
		Locale locale = new Locale("bn", "IN");
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.bengali", locale);
		System.out.println(rb.getString("bengali"));
	}
}