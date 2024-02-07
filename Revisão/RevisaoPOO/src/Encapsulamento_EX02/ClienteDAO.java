package Encapsulamento_EX02;

public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "Nome do cliente: " + clienteDTO.getNome() + 
                "\nRG: " + clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "Nome do cliente: " + clienteDTO.getNome() +
                "\nIdade: " + clienteDTO.getIdade();
    }
}