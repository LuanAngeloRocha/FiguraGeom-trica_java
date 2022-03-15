import java.util.Scanner;
public class Principal {
    
    public static void main(String[] abc){
    Quadrado quadrado = new Quadrado();
    
    System.out.println("Digite um lado ");
    Scanner leia= new Scanner(System.in);
    quadrado.setLado(leia.nextDouble());
       
        System.out.println(quadrado.getNomeFigura());
        System.out.println("Lado:"+quadrado.getLado());
        System.out.println("Area: "+quadrado.getArea());
        System.out.println("Perimetro:"+quadrado.getPerimetro());

        Triangulo triangulo = new Triangulo();
        System.out.println("Digite um lado A");
       
        triangulo.setLadoA(leia.nextDouble());
        System.out.println("Digite um lado B");
        triangulo.setLadoB(leia.nextDouble());
        System.out.println("Digite um lado C");
        triangulo.setLadoC(leia.nextDouble());
        System.out.println("Digite a altura");
        triangulo.setAltura(leia.nextDouble());
        System.out.println("Digite a base");
        triangulo.setBase(leia.nextDouble());

        leia.close();
        System.out.println(triangulo.getNomeFigura());
        System.out.println("Lado A:"+triangulo.getLadoA());
        System.out.println("Lado B:"+triangulo.getLadoB());
        System.out.println("Lado C:"+triangulo.getLadoC());
        System.out.println("Area: "+triangulo.getArea());
        System.out.println("Altura:"+triangulo.getAltura());
        System.out.println("Base:"+triangulo.getBase());


    }

}git
