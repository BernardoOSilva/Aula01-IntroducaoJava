package primeiraaula;

public class PrimeiraAula {

    public static void main(String[] args) {
        //Tipos de dados
        String nome = "Bernardo de Oliveira da Silva";
        int dataNascimento = 2004;       
        double altura = 1.76;        
        boolean eAluno = true;           
        char genero = 'M';        
        int idadeDois = qualIdade(2004);
        System.out.println("Olá "+ nome + " você tem "+ qualIdade(2004)+" anos de idade.");
        
        if(qualIdade(dataNascimento) >= 18){
            System.out.println("Você é maior de idade, pode ser preso!");
        }else{
            System.out.println("Você ainda não pode ser preso, mas pode apanhar!");
        }
        
        // VETORES
        String[] frutas = new String[5];
        frutas[0] = "LARANJA";
        frutas[1] = "MAÇA";
        frutas[2] = "PERA";
        frutas[3] = "ABACATE";
        frutas[4] = "MAMÃO";
        
        String[] frutasDois = {"LARANJA", "MAÇA"};
        int[] numeros = {1,2,3,4,5,6,7,8};
        int[] numerosDois = new int[8];
        numerosDois[0] = 0;
        numerosDois[1] = 1;
        
        // ESTRUTURA DE REPETIÇÃO
        for(int i = 0; i < 5; i++){
            System.out.println(frutas[i]);
        }
        
        for(String fruta: frutas){
            System.out.println(fruta);
        }
        
        int i = 0;
        while(i < frutas.length){
            System.out.println(frutas[i]);
            i++;
        }
        
        
        do{
           System.out.println(frutas[i]);
           i++;
        }while(i < frutas.length);   
        
        //CLASSES WRAPPER (INVOLUCRO)
        int variavelPrimitiva = 10;
        Integer variavelEnvolucra = new Integer(100);
        
        double valor = 2.10;
        Double valorEnvolucro = 2.10;
        
        boolean valorBool = false;
        Boolean valorBool2 = false;
        
    }
    
    static int qualIdade(int anoNascimento){
        return 2023 - anoNascimento;
    }
    
}
