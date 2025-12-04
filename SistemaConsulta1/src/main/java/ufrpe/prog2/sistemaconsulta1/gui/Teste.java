/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.gui;

import ufrpe.prog2.sistemaconsulta1.negocio.Agendamento;
import ufrpe.prog2.sistemaconsulta1.negocio.Medico;
import ufrpe.prog2.sistemaconsulta1.negocio.Paciente;

/**
 *
 * @author nini
 */
public class Teste {
    public static void main(String[] args) {
        Medico Ana = new Medico("Ana", "Ginecologista");
        Medico Bruno = new Medico("Bruno", "Cardiologista");

        Paciente paciente1 = new Paciente("Carlos", "11111111", "81912345678", "aaaaaaaa@gmail.com");
        Paciente paciente2 = new Paciente("Antonio", "22222222", "81923456789", "bbbbbbbbb@gmail.com");
        Paciente paciente3 = new Paciente("Pedro", "33333333", "91045678901", "ccccccccc@gmail.com");
        Paciente paciente4 = new Paciente("Joao", "444444", "91043232323", "dddddddddd@gmail.com");

        Agendamento agendamento1 = new Agendamento(Ana);
        agendamento1.setData("17/12/2025");
        agendamento1.adicionar(paciente3);
        agendamento1.adicionar(paciente4);
        agendamento1.apresentarListaDePacientes();

        Agendamento agendamento2 = new Agendamento(Bruno);
        agendamento2.setData("20/12/2025");
        agendamento2.adicionar(paciente1);
        agendamento2.adicionar(paciente2);
        agendamento2.apresentarListaDePacientes();

    }
}
