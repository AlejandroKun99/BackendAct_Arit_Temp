package com.example.tarea1y2_alejandrolopez;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class ServiceTempConv {

    public String CtoFConv (@WebParam (name = "celcius") double celcius)
    {
        double resultado = (celcius * (9/5)) + 32;
        return "" + celcius + "° grados celcius equivalen a " + resultado + "° grados farenheit";
    }

    public String FtoCConv (@WebParam (name = "farenheit") double farenheit)
    {
        double resultado = (farenheit - 32) * 5/9;
        return "" + farenheit + "° grados farenheit equivalen a " + resultado + "° grados celcius";
    }

}
