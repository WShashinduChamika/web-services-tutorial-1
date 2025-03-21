package com.example.soap;

import javax.xml.ws.Endpoint;

public class SoapServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/StringManipulationService";
        Endpoint.publish(url, new StringManipulationServiceImpl());
        System.out.println("SOAP Web Service is running at: " + url);
    }
}
