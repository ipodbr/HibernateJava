/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desenvolvimento3
 */
public class Aluno {
    
    private int aluCodigo;
    private String aluNome;
    private String aluCidade;
    private String aluFone;
    private String aluCurso;
    
    public Aluno(){
        
    }

    @Override
    public String toString() {
        return "ID: " + getAluCodigo() + " Nome: " + getAluNome() + " Cidade: " +
                getAluCidade() + " Fone: " + getAluFone() + " Curso: " + getAluCurso();
    }
    
    

    public int getAluCodigo() {
        return aluCodigo;
    }

    public void setAluCodigo(int aluCodigo) {
        this.aluCodigo = aluCodigo;
    }

    public String getAluNome() {
        return aluNome;
    }

    public void setAluNome(String aluNome) {
        this.aluNome = aluNome;
    }

    public String getAluCidade() {
        return aluCidade;
    }

    public void setAluCidade(String aluCidade) {
        this.aluCidade = aluCidade;
    }

    public String getAluFone() {
        return aluFone;
    }

    public void setAluFone(String aluFone) {
        this.aluFone = aluFone;
    }

    public String getAluCurso() {
        return aluCurso;
    }

    public void setAluCurso(String aluCurso) {
        this.aluCurso = aluCurso;
    }

    
    
    
}
