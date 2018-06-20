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
@WebService(serviceName = "Calculator")
public class Calculator {
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "calculate")
    public Double calculate(@WebParam(name = "num1") double num1, @WebParam(name = "operation") String operation, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
               
        if (operation.equals("*")){
            return num1 * num2;
    }
    else if (operation.equals("/")){
            return num1 / num2;
    }
    else if (operation.equals("-")){
            return num1 - num2;
    }
    else if (operation.equals("+")){
            return num1 + num2;
    }
    else    return null;
    }
}
