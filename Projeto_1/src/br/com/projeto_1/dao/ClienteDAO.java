package br.com.projeto_1.dao;

import java.sql.*;
import br.com.projeto_1.dto.ClienteDTO;

public class ClienteDAO {
    
    public ClienteDAO(){
           
    }
    
    private ResultSet rs = null; // guarda resultado do statement 
    private Statement stmt = null; // manipular o banco de dados leva e tras informacoes
    
    public boolean inserirCliente(ClienteDTO clienteDTO){
        try{
            // chama o metodo que esta na ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConnectDB();
            
            // Instancia o Statment que sera responsavel por executar alguma coisa no BD
            stmt = ConexaoDAO.con.createStatement();
            
            // Comando SQL que sera executado no banco de dados
            String comando = "Insert in cliente (nome_cli, logradouro_cli, numero_cli " 
                    + "bairro_cli, cidade_cli, estado_cli, cep_cli, cpf_cli, rg_cli) values( "
                    + "'" + clienteDTO.getNome_cli() + "', "
                    + "'" + clienteDTO.getLogradouro_cli() + "', "
                    + clienteDTO.getNumero_cli() + ", "
                    + "'" + clienteDTO.getBairro_cli() + "', "
                    + "'" + clienteDTO.getCidade_cli() + "', "
                    + "'" + clienteDTO.getEstado_cli() + "', "
                    + "'" + clienteDTO.getCep_cli() + "', "
                    + "'" + clienteDTO.getCpf_cli() + "', "
                    + "'" + clienteDTO.getRg_cli() + "') ";
            
            //Executa o comando SQL no bando de Dados
            stmt.execute(comando.toUpperCase());
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
          ConexaoDAO.CloseDB();
        }
    }
    
}// fecha a classe 