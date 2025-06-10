/*

Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os prazos sejam cumpridos,
você precisa calcular a data de entrega de cada projeto com base na data de início e no prazo estimado em dias.

Você precisa criar um programa que:

Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio03 {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);
    }
}
