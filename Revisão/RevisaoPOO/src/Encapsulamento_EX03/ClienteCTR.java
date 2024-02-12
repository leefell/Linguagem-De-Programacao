package Encapsulamento_EX03;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String Verifica(ClienteDTO clienteDTO){
        return clienteDAO.Verifica(clienteDTO);
    }   
}