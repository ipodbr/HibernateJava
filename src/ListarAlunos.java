
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desenvolvimento3
 */

public class ListarAlunos {
  
    public static void main(String[] args) {
        try {
            SessionFactory fabrica = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            Session sessao = fabrica.openSession();
           
            List<Aluno> listaAluno = new ArrayList<>();
            listaAluno = sessao.createQuery("FROM Aluno").list();
            
            int tamanhoLista = listaAluno.size();
            String dados = "";
            for (int i = 0; i < tamanhoLista; i++) {
                Aluno aluno = listaAluno.get(i);
                dados += aluno + "\n";
                System.out.println(aluno.toString());
                
            }
            JOptionPane.showMessageDialog(null, dados);
            
           
            sessao.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
