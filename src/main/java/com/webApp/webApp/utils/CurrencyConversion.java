package com.webApp.webApp.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConversion {
    /**
     * Method for requesting currency exchange service
     * @param fromCurrency
     * @return response from service
     */
    public static HttpResponse<String> RequestToCurrencyExchange(String fromCurrency){
        String url = String.format("http://data.fixer.io/api/latest?access_key=6eb751287d171bb40c9e732ded8c71c7&symbols=%s", fromCurrency);
        HttpResponse<String> response = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch(Exception e){

        }
        return response;
    }

    /**
     * Method for mappin currency exchange service response and getting exchange rate
     * @param fromCurrency
     * @return exchange rate
     */
    public static Double CurrencyExchangeResponseMapper (String fromCurrency){
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(RequestToCurrencyExchange(fromCurrency).body());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        JsonNode rates = root.path("rates");
        JsonNode currency = rates.get(fromCurrency);
        Double rate = currency.asDouble();
        return rate;
    }

    /**
     * Method for converting any currency to Euros
     * @param amountToConvert amount to convert
     * @param fromCurrency from specific currency
     * @return amount converted to Euros
     */
    public static Double convertAmountToEuros(Double amountToConvert, String fromCurrency){
        Double amountInEuros = amountToConvert / CurrencyExchangeResponseMapper(fromCurrency);
        Double amountInEurosRounded = Math.round(amountInEuros * 100.0) / 100.0;
        return amountInEurosRounded;
    }
}
