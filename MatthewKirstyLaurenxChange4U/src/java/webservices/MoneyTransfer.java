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
@WebService(serviceName = "MoneyTransfer")
public class MoneyTransfer {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "transfer")
    public double transfer(@WebParam(name = "senderName") String senderName, @WebParam(name = "receiverName") String receiverName, @WebParam(name = "moneyOrigin") String moneyOrigin, @WebParam(name = "moneyDestination") String moneyDestination, @WebParam(name = "conversionRate") Double conversionRate, @WebParam(name = "senderCurrency") String senderCurrency, @WebParam(name = "receiverCurrency") String receiverCurrency, @WebParam(name = "amountTransferred") double amountTransferred, @WebParam(name = "amountReceived") double amountReceived) {
        //TODO write your implementation code here:
        return amountTransferred;
    }
}
