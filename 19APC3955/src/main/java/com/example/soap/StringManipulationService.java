package com.example.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StringManipulationService {

    @WebMethod
    String reverseText(String text);

    @WebMethod
    int countCharacters(String text);
}
