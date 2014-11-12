package soap.webservices;/**
 * Created by sce on 12.11.2014.
 */
public class SoapClient {
  public static void main(String[] argv) {
    Calculator service = new Calculator_Service().getCalculator();
    //invoke business method
    System.out.println(service.addition(12,12));
    System.out.println(service.multiplication(12,34));
  }
}
