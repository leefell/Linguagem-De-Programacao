package Encapsulamento_EX04;

public class NumerosDAO {
    
    public String Mostrar(NumerosDTO numerosDTO){
        ordernarNumeros(numerosDTO);
        
        return "A sequência de números em ordem crescente é: \n" + 
               numerosDTO.getN1() + " " + numerosDTO.getN2() + " " + numerosDTO.getN3() + " " + numerosDTO.getN4() + " ";
        
        // a funcao de baixo recebe esse retorno
    }
    
    public void ordernarNumeros(NumerosDTO n){
        int aux;
        if(n.getN4() < n.getN1()){ // se n4 menor que n1
            aux = n.getN1(); // aux recebe n1
            n.setN1(n.getN4()); // n4 vai como set do n1, substituindo o valor de n1
            n.setN4(aux); // e n4 recebe aux, no caso n1
        }
        if(n.getN4() < n.getN2()){
            aux = n.getN2();
            n.setN2(n.getN4());
            n.setN4(aux);
        }
        if(n.getN4() < n.getN3()){
            aux = n.getN3();
            n.setN3(n.getN4());
            n.setN4(aux);
        }
    }
}