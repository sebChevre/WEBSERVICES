package webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by sce on 12.11.2014.
 */
@WebService
public class Calculator {

    @WebMethod
    public String addition(float valeur1, float valeur2){
        return String.valueOf(valeur1 + valeur2);
    }

    @WebMethod
    public String multiplication(float valeur1, float valeur2){
        return String.valueOf(valeur1 * valeur2);
    }
}
