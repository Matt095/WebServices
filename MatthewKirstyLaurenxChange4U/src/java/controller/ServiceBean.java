/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import calculator.Calculator_Service;
import currencyConversion.CurrencyConversion_Service;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import moneyTransfer.MoneyTransfer_Service;

/**
 *
 * @author cmpmchad
 */
@Named(value = "serviceBean")
@SessionScoped
public class ServiceBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MatthewKirstyLaurenxChange4U/Calculator.wsdl")
    private Calculator_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MatthewKirstyLaurenxChange4U/MoneyTransfer.wsdl")
    private MoneyTransfer_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MatthewKirstyLaurenxChange4U/CurrencyConversion.wsdl")
    private CurrencyConversion_Service service;

    private String requestedService;
    private String parameterName;
    
    private String parameterValue1CC;
    private String parameterValue2CC;
    private double parameterValue3CC;
    
    private String parameterValue1MT;
    private String parameterValue2MT;
    private String parameterValue3MT;
    private String parameterValue4MT;
    private double parameterValue5MT;
    private String parameterValue6MT;
    private String parameterValue7MT;
    private double parameterValue8MT;
    private double parameterValue9MT;
    
    private double parameterValue1Cal;
    private String parameterValue2Cal;
    private double parameterValue3Cal;
    
    private double result;
    
    /**
     * Creates a new instance of ServiceBean
     */
    public ServiceBean() {
    }

    public String getRequestedService() {
        return requestedService;
    }

    public void setRequestedService(String requestedService) {
        this.requestedService = requestedService;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterValue1CC() {
        return parameterValue1CC;
    }

    public void setParameterValue1CC(String parameterValue1CC) {
        this.parameterValue1CC = parameterValue1CC;
    }

    public String getParameterValue2CC() {
        return parameterValue2CC;
    }

    public void setParameterValue2CC(String parameterValue2CC) {
        this.parameterValue2CC = parameterValue2CC;
    }

    public double getParameterValue3CC() {
        return parameterValue3CC;
    }

    public void setParameterValue3CC(double parameterValue3CC) {
        this.parameterValue3CC = parameterValue3CC;
    }

    public String getParameterValue1MT() {
        return parameterValue1MT;
    }

    public void setParameterValue1MT(String parameterValue1MT) {
        this.parameterValue1MT = parameterValue1MT;
    }

    public String getParameterValue2MT() {
        return parameterValue2MT;
    }

    public void setParameterValue2MT(String parameterValue2MT) {
        this.parameterValue2MT = parameterValue2MT;
    }

    public String getParameterValue3MT() {
        return parameterValue3MT;
    }

    public void setParameterValue3MT(String parameterValue3MT) {
        this.parameterValue3MT = parameterValue3MT;
    }

    public String getParameterValue4MT() {
        return parameterValue4MT;
    }

    public void setParameterValue4MT(String parameterValue4MT) {
        this.parameterValue4MT = parameterValue4MT;
    }

    public double getParameterValue5MT() {
        return parameterValue5MT;
    }

    public void setParameterValue5MT(double parameterValue5MT) {
        this.parameterValue5MT = parameterValue5MT;
    }

    public String getParameterValue6MT() {
        return parameterValue6MT;
    }

    public void setParameterValue6MT(String parameterValue6MT) {
        this.parameterValue6MT = parameterValue6MT;
    }
    
    public String getParameterValue7MT() {
        return parameterValue7MT;
    }

    public void setParameterValue7MT(String parameterValue7MT) {
        this.parameterValue7MT = parameterValue7MT;
    }

    public double getParameterValue8MT() {
        return parameterValue8MT;
    }

    public void setParameterValue8MT(double parameterValue8MT) {
        this.parameterValue8MT = parameterValue8MT;
    }

    public double getParameterValue9MT() {
        return parameterValue9MT;
    }

    public void setParameterValue9MT(double parameterValue9MT) {
        this.parameterValue9MT = parameterValue9MT;
    }

    public double getParameterValue1Cal() {
        return parameterValue1Cal;
    }

    public void setParameterValue1Cal(double parameterValue1Cal) {
        this.parameterValue1Cal = parameterValue1Cal;
    }

    public String getParameterValue2Cal() {
        return parameterValue2Cal;
    }

    public void setParameterValue2Cal(String parameterValue2Cal) {
        this.parameterValue2Cal = parameterValue2Cal;
    }

    public double getParameterValue3Cal() {
        return parameterValue3Cal;
    }

    public void setParameterValue3Cal(double parameterValue3Cal) {
        this.parameterValue3Cal = parameterValue3Cal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void goToInputCCPage(String service){
        if(service.equals("Convert")){
            this.requestedService=service;
            if(this.requestedService.equals("Convert")) this.parameterName="Convert";
            FacesContext.getCurrentInstance()
                    .getApplication().getNavigationHandler()
                    .handleNavigation(FacesContext.getCurrentInstance(), null, "/inputCC.xhtml");
        }
    }
    
    public void goToInputMTPage(String service){
        if(service.equals("Transfer")){
            this.requestedService=service;
            if(this.requestedService.equals("Transfer")) this.parameterName="Transfer";
            FacesContext.getCurrentInstance()
                    .getApplication().getNavigationHandler()
                    .handleNavigation(FacesContext.getCurrentInstance(), null, "/inputMT.xhtml");
        }
    }
    
    public void goToInputCalPage(String service){
        if(service.equals("Calculate")){
            this.requestedService=service;
            if(this.requestedService.equals("Calculate")) this.parameterName="Calculate";
            FacesContext.getCurrentInstance()
                    .getApplication().getNavigationHandler()
                    .handleNavigation(FacesContext.getCurrentInstance(), null, "/inputCal.xhtml");
        }
    }
    
    private double convertCurrency(java.lang.String countryFrom, java.lang.String countryTo, double amount) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        currencyConversion.CurrencyConversion port = service.getCurrencyConversionPort();
        return port.convertCurrency(countryFrom, countryTo, amount);
    }

    private double transfer(java.lang.String senderName, java.lang.String receiverName, java.lang.String moneyOrigin, java.lang.String moneyDestination, java.lang.Double conversionRate, java.lang.String senderCurrency, java.lang.String receiverCurrency, double amountTransferred, double amountReceived) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        moneyTransfer.MoneyTransfer port = service_1.getMoneyTransferPort();
        return port.transfer(senderName, receiverName, moneyOrigin, moneyDestination, conversionRate, senderCurrency, receiverCurrency, amountTransferred, amountReceived);
    }

    private Double calculate(double num1, java.lang.String operation, double num2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        calculator.Calculator port = service_2.getCalculatorPort();
        return port.calculate(num1, operation, num2);
    }
    
	//Service call for calulation and converter
    public void callService(){
        if(requestedService.equals("Convert")){
            this.result=convertCurrency(parameterValue1CC,parameterValue2CC,parameterValue3CC);
        }
        else if(requestedService.equals("Calculate")){
            this.result=calculate(parameterValue1Cal, parameterValue2Cal, parameterValue3Cal);
        }
        FacesContext.getCurrentInstance()
                .getApplication().getNavigationHandler()
                .handleNavigation(FacesContext.getCurrentInstance(), null, "/output.xhtml");
    }
    
	//Money Transfer call
    public void callServiceMT(){
        if(requestedService.equals("Transfer")){
            this.result=transfer(parameterValue1MT, parameterValue2MT, parameterValue3MT, parameterValue4MT, parameterValue5MT, parameterValue6MT, parameterValue7MT, parameterValue8MT, parameterValue9MT);
        }
        FacesContext.getCurrentInstance()
                .getApplication().getNavigationHandler()
                .handleNavigation(FacesContext.getCurrentInstance(), null, "/outputMT.xhtml");
    }
}
