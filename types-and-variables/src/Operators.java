public class Operators {
    public static void main(String[] args) {
        /*String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/


        int numero = 5;
                
        //Imprimindo o numero negativo
        System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);
        numero *= -1;
        System.out.println(numero);
        numero *= -1;
        System.out.println(numero);

        System.out.println("");
        numero = 5;

        //incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++numero);

        System.out.println("");

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        System.out.println(verdadeiro);

        System.out.println("");

        int a = 5;
        int b = 5;

        boolean resultado = a==b ? true : false;

        System.out.println(resultado);

        System.out.println();

        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        System.out.println();
       
        int numero3 = 130;
        int numero4 = 130;
        System.out.println(numero3 == numero4); //true
        
        Integer numero5 = 130;
        Integer numero6 = 130;

        System.out.println(numero5 == numero6); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
        System.out.println(numero5.equals(numero6)); 

        System.out.println();

        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");
    }
}