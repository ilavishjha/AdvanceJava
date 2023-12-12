package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestHindi {
	
		public static void main(String[] args) {
			Locale locale=new Locale("hi","IN");
			ResourceBundle rb=ResourceBundle.getBundle("in.co.rays.bundle.ok",locale);
			System.out.println(rb.getString("ok"));
		}
		}


