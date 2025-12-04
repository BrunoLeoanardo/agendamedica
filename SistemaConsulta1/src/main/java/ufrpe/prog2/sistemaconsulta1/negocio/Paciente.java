/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufrpe.prog2.sistemaconsulta1.negocio;

/**
 *
 * @author nini
 */
public class Paciente extends Usuario {
    private String telefone;

    public Paciente (String nome, String cpf, String telefone, String email) {
        super(nome,cpf,email);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  
}
