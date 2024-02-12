package Encapsulamento_EX05;

public class ClienteDAO {
    
    public String Registro(ClienteDTO c){
        return "Os dados gravados são:" +
                "\nNome: " + c.getNome() +
                "\nLogradouro: " + c.getLogradouro()+
                "\nBairro: " + c.getBairro()+
                "\nCidade: " + c.getCidade()+
                "\nEstado: " + c.getEstado()+
                "\nCEP: " + c.getCEP() +
                "\nCPF: " + c.getCPF() +
                "\nRG: " + c.getRG() +
                "\nNúmero: " + c.getNumero();
    }
    
    public void limparCampos(ClienteDTO c){
        c.setNome("");
        c.setLogradouro("");
        c.setNumero("");
        c.setBairro("");
        c.setCidade("");
        c.setEstado("");
        c.setCEP("");
        c.setCPF("");
        c.setRG("");
    }
}