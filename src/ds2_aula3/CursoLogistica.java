/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2_aula3;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class CursoLogistica {
    
    private String idTurma;
    private ArrayList<Estudante> listaAlunos;

    public CursoLogistica(String idTurma) {
        this.idTurma = idTurma;
        listaAlunos = new ArrayList<Estudante>();
    }
    
    public void adicionaAluno(Estudante alunoNovo){
        listaAlunos.add(alunoNovo);
    }
    
    public void removeAluno(Estudante alunoRemovido){
        listaAlunos.remove(alunoRemovido);
    }
    
 
    public String getIdTurma() {
        return idTurma;
    }

 
    public ArrayList<Estudante> getListaAlunos() {
        return listaAlunos;
    }

    
}
