/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author cmpmchad
 */
@WebService(serviceName = "CurrencyConversion")
public class CurrencyConversion {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "convertCurrency")
    public double convertCurrency(@WebParam(name = "countryFrom") String countryFrom, @WebParam(name = "countryTo") String countryTo, @WebParam(name = "amount") double amount) {
        //TODO write your implementation code here:
        
		//Return same value if currencies are the same
        if(countryFrom.equals(countryTo)){
            return amount;
        }
        
		//GBP to XXX
        else if(countryFrom.equals("GBP") && countryTo.equals("USD")){
            return amount * 1.22;
        }
        
        else if(countryFrom.equals("GBP") && countryTo.equals("EUR")){
            return amount * 1.15;
        }
        
        else if(countryFrom.equals("GBP") && countryTo.equals("JPY")){
            return amount * 140.26;
        }
        
		//USD to XXX
        else if(countryFrom.equals("USD") && countryTo.equals("GBP")){
            return amount / 1.22;
        }
        
        else if(countryFrom.equals("USD") && countryTo.equals("EUR")){
            return amount / 1.06;
        }
        
        else if(countryFrom.equals("USD") && countryTo.equals("JPY")){
            return amount * 115.43;
        }
        
		//EUR to XXX
        else if(countryFrom.equals("EUR") && countryTo.equals("GBP")){
            return amount / 1.15;
        }
        
        else if(countryFrom.equals("EUR") && countryTo.equals("USD")){
            return amount * 1.06;
        }
        
        else if(countryFrom.equals("EUR") && countryTo.equals("JPY")){
            return amount * 122.45;
        }
		
		//JPY to XXX
        else if(countryFrom.equals("JPY") && countryTo.equals("GBP")){
            return amount / 140.26;
        }
        
        else if(countryFrom.equals("JPY") && countryTo.equals("USD")){
            return amount / 115.43;
        }
        
        else if(countryFrom.equals("JPY") && countryTo.equals("EUR")){
            return amount / 122.45;
        }
        
		// if empty
        else 
            return 0.0;
        
    }
}
