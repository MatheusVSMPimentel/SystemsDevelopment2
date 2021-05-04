/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_aula3;

/**
 *
 * @author mathe
 */
public class Estudante {
    
    private String nome;
    private int matricula;
    
    public Estudante(String nome, int matricula){
        super();
        this.nome = nome;
        this.matricula = matricula;          
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}

