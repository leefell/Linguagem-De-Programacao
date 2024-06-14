package br.com.projeto_3.ctr;

import br.com.projeto_3.dao.ConexaoDAO;
import br.com.projeto_3.dao.VendaDAO;
import br.com.projeto_3.dto.VendaDTO;
import br.com.projeto_3.dto.ClienteDTO;
import javax.swing.JTable;

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR(){
        
    }
    
    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos){
        try{
            if(vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)){
                return "Venda cadastrada com sucesso!";
            }else{
                return "Venda não cadastrada!"; 
            }
        }catch(Exception e){
            System.out.println("Erro disparado em VendaCTR " + e.getMessage());
            return "Venda NÃO cadastrada!";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
}
