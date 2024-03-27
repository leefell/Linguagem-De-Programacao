package br.com.avaliacao_1.ctr;

import java.sql.ResultSet;
import br.com.avaliacao_1.dto.AlunoDTO;
import br.com.avaliacao_1.dao.AlunoDAO;
import br.com.avaliacao_1.dao.ConexaoDAO;

public class AlunoCTR {
    
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public AlunoCTR(){
        
    }
    
    public String inserirAluno(AlunoDTO alunoDTO){
        try{
            
           if(alunoDAO.inserirAluno(alunoDTO)){
               return "Aluno Cadastrado com Sucesso!";
           }else{
               return "Aluno NÃO Cadastrado!";
           }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Aluno NÃO Cadastrado!";
        }
    }
    
    public String alterarAluno(AlunoDTO alunoDTO){
        try{
            if(alunoDAO.alterarAluno(alunoDTO)){
                return "Aluno alterado com sucesso!";
            }else{
                return "Aluno não alterado!";
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
            return "Aluno não alterado!";
        }
    }
    
    public String excluirAluno(AlunoDTO alunoDTO){
        try{
            if(alunoDAO.excluirAluno(alunoDTO)){
                return "Aluno excluído com sucesso!";
            }else{
                return "Aluno não excluído!";
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
            return "Aluno não excluído!";
        }
    }
    
    public ResultSet consultarAluno(AlunoDTO alunoDTO, int opcao){
        return alunoDAO.consultarAluno(alunoDTO, opcao);
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
}
