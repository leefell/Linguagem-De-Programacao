package Encapsulamento_EX01;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    
    public static void main(String[] args) {
        
        try{
            
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog(("Digite seu nome: ")));
            clienteDTO.setRg(JOptionPane.showInputDialog("Digite o RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
            
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro no sistma." + erro);
        }
    }
}
