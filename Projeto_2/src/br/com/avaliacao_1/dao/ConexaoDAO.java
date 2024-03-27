package br.com.avaliacao_1.dao;

import java.sql.*;

public class ConexaoDAO {
   
    public static Connection con = null;
    
    public ConexaoDAO(){
        
    }
    
    public static void ConnectDB(){
        try{
            
            String dsn = "avaliacao_1";
            String user = "postgres";
            String senha = "postdba";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:5433/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if(con == null){
                System.out.println("Erro ao abrir o banco, erro disparado em: ConexaoDAO");
            }
            
        }catch(Exception e){
            System.out.println("Problema ao abrir a basse de dados!, erro disparado em: ConexaoDAO" + 
                    e.getMessage());
        }
    }
    
    public static void CloseDB(){
        try{
            con.close();
        }catch(Exception e){
            System.out.println("Problema ao fechar a base de dados! " + e.getMessage());
        }
    }
}