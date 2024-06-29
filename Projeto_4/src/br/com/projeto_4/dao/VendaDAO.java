package br.com.projeto_4.dao;

import br.com.projeto_4.dto.ClienteDTO;
import br.com.projeto_4.dto.VendaDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class VendaDAO {
    
    // ResultSet serve para realiza as consultas no banco de dados.
    private ResultSet rs = null;
    
    // Manipular o banco de dados.
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    
    public VendaDAO(){
        
    }

    public boolean inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos){
        try{
            ConexaoDAO.ConnectDB();
            
            // Executa alguma coisa no banco de dados.
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            
            String comando1 = "Insert into Venda (dat_vend, val_vend, "
                    + "id_cli) values ( "
                    + "to_date('" + date.format(vendaDTO.getDat_vend()) + "', 'DD/MM/YYYY'), "
                    + vendaDTO.getVal_vend() + ", "
                    + clienteDTO.getId_cli() + ")";
            
            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            
            for(int i=0; i < produtos.getRowCount(); i++){
                String comando2 = "Insert into produto_venda (id_vend, id_prod, "
                        + "val_prod, qtd_prod) values ( "
                        + rs.getInt("id_vend") + ", "
                        + produtos.getValueAt(i, 0) + ", "
                        + produtos.getValueAt(i, 2) + ", "
                        + produtos.getValueAt(i, 3) + "); ";
                
                stmt1.execute(comando2);
            }
            
            ConexaoDAO.con.commit();
            
            stmt.close();
            stmt1.close();
            rs.close();
            return true;
        }catch(Exception e){ 
            System.out.println("Erro na classe VendaDAO! " + e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
}
