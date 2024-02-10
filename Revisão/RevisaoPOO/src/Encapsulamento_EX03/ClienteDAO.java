package Encapsulamento_EX03;

public class ClienteDAO {
    
    public String Verifica(ClienteDTO clienteDTO){
        
        if(clienteDTO.getIdade() < 18){
            return "O motorista ainda não pode ser habilitado.";
        }else{
            return "O motorista tem idade suficiente para ser habilitado";
        }
    }
    
}