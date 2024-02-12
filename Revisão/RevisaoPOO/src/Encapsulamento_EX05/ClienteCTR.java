package Encapsulamento_EX05;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String Registro(ClienteDTO clienteDTO){
        return clienteDAO.Registro(clienteDTO);
    }
    
    public void limparCampos(ClienteDTO clienteDTO){
        clienteDAO.limparCampos(clienteDTO);
    }
}