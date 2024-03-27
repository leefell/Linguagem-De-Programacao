package br.com.avaliacao_1.dao;

import java.sql.*;
import br.com.avaliacao_1.dto.AlunoDTO;

public class AlunoDAO {
    
    public AlunoDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    
    public boolean inserirAluno(AlunoDTO alunoDTO){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            System.out.println("Chegou no inseriraluno");
            String comando = "INSERT INTO aluno (nome_aluno, rg_aluno, cpf_aluno, telefone_aluno, "
                + "numeroCasa_aluno, dtaNascimento_aluno, cep_aluno, cidade_aluno, bairro_aluno, "
                + "estado_aluno, curso_aluno, email_aluno) VALUES ("
                + "'" + alunoDTO.getNome_aluno() + "', "
                + "'" + alunoDTO.getRg_aluno() + "', "
                + "'" + alunoDTO.getCpf_aluno() + "', "
                + "'" + alunoDTO.getTelefone_aluno() + "', "
                + alunoDTO.getNumeroCasa_aluno() + ", "
                + "'" + alunoDTO.getDtaNascimento_aluno() + "', "
                + "'" + alunoDTO.getCep_aluno() + "', "
                + "'" + alunoDTO.getCidade_aluno() + "', "
                + "'" + alunoDTO.getBairro_aluno() + "', "
                + "'" + alunoDTO.getEstado_aluno() + "', "
                + "'" + alunoDTO.getCurso_aluno() + "', "
                + "'" + alunoDTO.getEmail_aluno()+ "')";
            System.out.println(comando);
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            return true;
            
        }catch(Exception e){
             System.out.println(e.getMessage());
             return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarAluno(AlunoDTO alunoDTO, int opcao){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao){
                case 1:
                    comando = "Select c.*, to_char(dtanascimento_aluno, 'dd/MM/yyyy') as data_nascimento " + "from aluno c " + "where nome_aluno like '" + alunoDTO.getNome_aluno()+ "%' " + 
                            "order by c.nome_aluno";
                    break;
                case 2:
                    comando = "Select c.*, to_char(dtanascimento_aluno, 'dd/MM/yyyy') as data_nascimento " + "from aluno c " + "where c.id_aluno = " + alunoDTO.getId_aluno();
                    break;
                case 3:
                    comando = "Select c.id_aluno, c.nome_aluno " +
                            "from aluno c";
                    break;
            }
            System.out.println(comando);
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }catch(Exception e){
            System.out.println("Erro!" + e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarAluno(AlunoDTO alunoDTO){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update aluno set "
                    + "nome_aluno = '" + alunoDTO.getNome_aluno() + "', "
                    + "rg_aluno = '" + alunoDTO.getRg_aluno() + "', "
                    + "cpf_aluno = '" + alunoDTO.getCpf_aluno() + "', "
                    + "telefone_aluno = '" + alunoDTO.getTelefone_aluno() + "', "
                    + "cep_aluno = '" + alunoDTO.getCep_aluno() + "', "
                    + "numeroCasa_aluno = " + alunoDTO.getNumeroCasa_aluno() + ", "
                    + "dtaNascimento_aluno = '" + alunoDTO.getDtaNascimento_aluno() + "', "
                    + "cidade_aluno = '" + alunoDTO.getCidade_aluno() + "', "
                    + "bairro_aluno = '" + alunoDTO.getBairro_aluno() + "', "
                    + "estado_aluno = '" + alunoDTO.getEstado_aluno() + "', "
                    + "curso_aluno = '" + alunoDTO.getCurso_aluno() + "', "
                    + "email_aluno = '" + alunoDTO.getEmail_aluno() + "' "
                    + "WHERE id_aluno = " + alunoDTO.getId_aluno();
            System.out.println(comando);
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();            
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirAluno(AlunoDTO alunoDTO){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from aluno where id_aluno = " + alunoDTO.getId_aluno();
            System.out.println(comando);
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
}
