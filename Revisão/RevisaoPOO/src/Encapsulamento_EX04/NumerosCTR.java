package Encapsulamento_EX04;

public class NumerosCTR {
    
    NumerosDAO numerosDAO = new NumerosDAO();
    
    public String Mostrar(NumerosDTO numerosDTO){
        return numerosDAO.Mostrar(numerosDTO);
    }
    
    public void ordernarNumeros(NumerosDTO numerosDTO){
        numerosDAO.ordernarNumeros(numerosDTO);
    }
}
