package com.exemple;
//Ce projet est commité
public interface Calculateur { public int calcul (int n);
}
class IntroLambda{
    //Utilisation d'une classe anonyme pour paramétrer l'appel d'une interface;
    public static void main(String[] args) {
        int n1 =5, n2=3;
    Calculateur carre = new Calculateur() {
        @Override
        public int calcul(int n) {

            return n*n;
        }
    };
    int res =carre.calcul(n1);
        System.out.println("Carre de "+n1+"="+res);
        System.out.println("Carre de "+n2+"="+carre.calcul(n2));
    }


}
class IntroLambda2{
    //Adaptation du programme précédent avec une expression lambda

    //Avec Java8 on peut remplacer
    //Calculateur carre = x-> x*x;
    public static void main(String[] args) {
        int n3=3, n4=5;
        Calculateur cub = x -> x*x*x;
        int cub3 = cub.calcul(n3);
        System.out.println("Cube de est 3 ="+cub3+", et cube de 5 est ="+cub.calcul(n4));
    }
}
class IntroLambda3{
    //Une expression lambda constituée d'un bloc
    public static void main(String[] args) {
        int n1=5,n2=4,n3=-5,n4=6;
        Calculateur complique = x -> {
            if(x>0 && 2*(x/2)==x) return x;
            else if(x>0) return x+1;
            else return -x;
        };
        int res = complique.calcul(n1);
        System.out.println("Complique de "+n1+" = "+res);
        System.out.println("Complique de "+n2+" = "+complique.calcul(n2));
        System.out.println("Complique de "+n3+" = "+complique.calcul(n3));
        System.out.println("Complique de "+n4+" = "+complique.calcul(n4));
    }
}
class LambdaRappel{
    public static void main(String[] args) {
        Calculateur polynome = x-> x*x+2*x-1;
        traite(5, x-> x*x);
        traite(12, x->2*x*x+3*x+5);
        traite(4, x->(x*x*x)/8);
        traite(2,polynome);

    }
    public static void traite(int n, Calculateur cal){
        int res = cal.calcul(n);
        System.out.println("Calcul (" + n + ")="+res);
    }
}