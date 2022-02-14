package com.dio.inversionOfControl;

public class EnviarEmails {

    public EnviarEmails(String type, String address, String password) {

    }

    public static EnviarEmails obterDadosEmail() {
        return new EnviarEmails("stmp", "rafafsi@gmail.com", "pass");
    }

    public void retornar(String message) {
        System.out.println("e-mail sent!");
    }
}
