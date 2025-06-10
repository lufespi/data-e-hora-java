/*

Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões.

Para garantir uma boa organização, o sistema precisa verificar se um evento já ocorreu ou ainda está por vir com base na data atual.

Crie um programa que:

Receba uma data de evento previamente cadastrada.
Compare essa data com a data atual.
Exiba a data do evento e a data atual no formato dd-MM-yyyy.
Informe se o evento já ocorreu ou ainda está por vir.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio05 {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.of(2025, 3, 15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }
    }
}
