//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medico Ana = new Medico("Ana", "Ginecologista");
        Medico Bruno = new Medico("Bruno", "Cardiologista");

        Paciente paciente1 = new Paciente("Carlos", "11111111", "81912345678", aaaaaaaa@gmail.com);
        Paciente paciente2 = new Paciente("Antonio", "22222222", "81923456789", bbbbbbbbb@gmail.com);
        Paciente paciente3 = new Paciente("Pedro", "33333333", "91045678901", ccccccccc@gmail.com);
        Paciente paciente4 = new Paciente("João", "444444", "91043232323", dddddddddd@gmail.com);

        Agendamento agendamento1 = new Agendamento(Ana);
        agendamento1.setData("dd/dd/dd");
        agendamento1.adicionar(paciente3);
        agendamento1.adicionar(paciente4);
        agendamento1.remover("444444");
        agendamento1.apresentarListaDePacientes();

        Agendamento agendamento2 = new Agendamento(Bruno);
        agendamento2.setData("dd/dd/dd");
        agendamento2.adicionar(paciente1);
        agendamento2.adicionar(paciente2);
        agendamento2.apresentarListaDePacientes();


    }
}
