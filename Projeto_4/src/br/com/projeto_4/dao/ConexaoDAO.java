package br.com.projeto_4.dao;

import java.sql.*;

public class ConexaoDAO {
    
    public static Connection con = null;
    
    public ConexaoDAO(){
        
    }
    
    public static void ConnectDB(){
        try{
            
            //Dados para conectar com o banco de dados Postgres
            String dsn = ""; // nome do banco de dados
            String user = ""; // nome do usuario utilizado para se conectar
            String senha = ""; // senha do usuario 
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            
            String url = "jdbc:postgresql://localhost:xxxx/" + dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if(con == null){
                System.out.println("Erro ao abrir o banco");
            }
            
        }catch(Exception e){
            System.out.println("Problema ao abrir a base de dados! " + 
                    e.getMessage());
        }
    }
    
    public static void CloseDB(){
        try{
            con.close();
        }catch(Exception e){
            System.out.println("Problema ao fechar a base de dados! " +
                    e.getMessage()); 
        }
    }
    
}