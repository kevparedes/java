/*
 	Given a double-precision number, payment , denoting an amount of money,
  	use the NumberFormat class' getCurrencyInstance method to 
  	convert payment into the US, Indian, Chinese, and French currency 
  	formats. Then print the formatted values as follows:
	
	US: formattedPayment
	India: formattedPayment
	China: formattedPayment
	France: formattedPayment
	
	where formattedPayment is p  formatted according to the appropriate Locale's currency.
 	=============================================
	Sample Input 				|  Sample output
	=============================================
	12324.134					|	US: $12,324.13
								|	India: Rs.12,324.13
								|	China: ￥12,324.13
								|	France: 12 324,13 €
 */

package Easy;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        
        Locale india = new Locale("en","IN");
        NumberFormat in = NumberFormat.getCurrencyInstance(india);
        
        Locale china = new Locale("zh","CN");
        NumberFormat ch = NumberFormat.getCurrencyInstance(china);
        
        Locale france = new Locale("fr","FR");
        NumberFormat fr = NumberFormat.getCurrencyInstance(france);
        
        System.out.println("US: " + defaultFormat.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}
