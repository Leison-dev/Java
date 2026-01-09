

public class aula2 {
    public static void main(String[]args){
        //Operadores Aritiméticos//
        //+ - / * //
        int numero1 = 10;
        int numero2 = 20;
        //Operadores Relacionais//
        // % < > <= >= != == //
        System.out.println(numero2 / numero1);
        System.out.println(numero1+numero2);
        System.out.println(numero2-numero1);
        System.out.println(numero1*numero2);
        //Operadores Logicos AND//
        //&& (AND) || (or) ! //
        int idade = 35;
        float salario = 3500F;
        boolean dentroDaLei = idade > 30 && salario >= 4612;
        boolean dentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(dentroDaLei);
        System.out.println(dentroDaLeiMenorQueTrinta);

    }
    
}
