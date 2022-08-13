package com.example.tarea1y2_alejandrolopez;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class ServiceArit {

    public String addition (@WebParam (name = "valor1") int valor1, @WebParam (name = "valor2") int valor2)
    {
        int resultado = valor1 + valor2;
        return "Resultado: " + resultado;
    }

    public String sustraction (@WebParam (name = "valor1") int valor1, @WebParam (name = "valor2") int valor2)
    {
        int resultado = valor1 - valor2;
        return "Resultado: " + resultado;
    }

    public String multiply (@WebParam (name = "valor1") int valor1, @WebParam (name = "valor2") int valor2)
    {
        int resultado = valor1 * valor2;
        return "Resultado: " + resultado;
    }

    public String divide (@WebParam (name = "valor1") int valor1, @WebParam (name = "valor2") int valor2)
    {
        int resultado = valor1 / valor2;
        return "Resultado: " + resultado;
    }

}
