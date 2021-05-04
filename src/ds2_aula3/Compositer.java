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
public class Compositer {
    
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Matheus", 3123);
        Estudante aluno2 = new Estudante("Outro", 23);
        
        CursoLogistica novaTurma = new CursoLogistica(" 2019.1A");
        novaTurma.adicionaAluno(aluno2);
        novaTurma.adicionaAluno(aluno1);
        
        Estudante aluno3 = new Estudante("asuhm", 31);
        Estudante aluno4 = new Estudante("Outro", 2);
        
        novaTurma.adicionaAluno(aluno3);
        novaTurma.adicionaAluno(aluno4);
        
        System.out.println("Alunos da turma"+ novaTurma.getIdTurma());
        
        for (Estudante aluno : novaTurma.getListaAlunos()){
            System.out.println(aluno.getNome() +" "+ aluno.getMatricula());
        }
        
    }
    
}
