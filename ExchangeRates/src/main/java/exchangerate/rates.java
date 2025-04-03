package exchangerate;

public class rates {
    static final double UGX_to_USD = 0.00035;
    static final double USD_to_UGX= 3500;
    public static double displayRates(String from, String to){
       if (from.equals("UGX") &&  to.equals("USD") ){
           return UGX_to_USD;
       } else if (from.equals("USD") && to.equals("UGX")) {
           return USD_to_UGX;
       }
       else {
           return 0;
       }
    }
}
