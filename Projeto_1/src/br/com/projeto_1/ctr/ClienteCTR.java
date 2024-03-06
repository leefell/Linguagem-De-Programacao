package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;

public class ClienteCTR {

    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR(){
        
    }
    
    public String inserirCliente(ClienteDTO clienteDTO){
        try{
            // Chama o método que esta na classe DAO aguardando uma resposta ( T ou F )
            if(clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente Cadastrado com Sucesso!";
            }else{
                return "Cliente Não Cadastrado!";
            }
            
            // Caso tenha algum erro no codigo acima é enviado uma mensagem no console
            // com oque esta acontecendo.
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Cliente Não Cadastrado.";
        }
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        return clienteDAO.consultarCliente(clienteDTO, opcao);
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}