import java.util.Scanner;

public class EjerciciosChill {
    void nombre() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = myObj.nextLine();
        System.out.println("Hola "+ nombre +"!");

    }

    void cuadradoNum() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese un numero para elevarlo al cuadrado ");
        int num = Integer.parseInt(obj.nextLine());
        int cuadrado = num*num;
        System.out.println( "El numero "+num+" es: "+ cuadrado);

    }

    void listaOp() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = Integer.parseInt(obj.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int num2 = Integer.parseInt(obj.nextLine());
        int sum = num1+num2;
        int mult= num1*num2;
        double div = num1/num2;
        int rest= num1-num2;
        double residuo = num1%num2;

        System.out.println("Las operaciones entre numeros son: ");
        System.out.println("Suma: "+sum);
        System.out.println("Multiplicación: "+mult);
        System.out.println("Divisón: "+div);
        System.out.println("Resta: "+rest);
        System.out.println("Residuo: "+ residuo);
    }

    void holaMundo(){
        System.out.println("Hola mundo");

    }

    void sumaNum() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = Integer.parseInt(obj.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int num2 = Integer.parseInt(obj.nextLine());
        int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: "+ suma);

    }

    void entDec() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el número decimal: ");
        float num = obj.nextFloat();

        long ent= (long) num;
        double dec= num-ent;

        System.out.println("Parte entera: "+ent+", parte decimal: "+dec);
    }

    public static double notaFinal() {


        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese la primera nota (15%): ");
        double nota1 = obj.nextDouble();
        System.out.println("Ingrese la segunda nota: (20%)");
        double nota2 = obj.nextDouble();
        System.out.println("Ingrese la tercera nota: (15%)");
        double nota3 = obj.nextDouble();
        System.out.println("Ingrese la cuarta nota: (30%)");
        double nota4 = obj.nextDouble();
        System.out.println("Ingrese la quinta nota: (20%)");
        double nota5 = obj.nextDouble();

        double resultado = (nota1*0.15)+(nota2*0.2)+(nota3*0.15)+(nota4*0.3)+(nota5*0.2);
        System.out.println("Su nota final es de: "+ resultado);
        return resultado;

    }

    void llamoFuncion(){

        double miNotitaFinal= notaFinal();


    }

    public static double calcularIVA(double precio) {
        return precio*0.19;

    }



    public static int llamoIVA(){
        return 0;
    }

    public static int recursividad(){
        return 0;
    }

    void areaPerimetroCirculo(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el radio de su círculo: ");
        int radio = obj.nextInt();

        double area = 3.14159*(radio)*(radio);
        double perimetro = 2*3.14159*(radio);

        System.out.println("El area del círculo es: "+ area+" aproximadamente");
        System.out.println("El perimetro del círculo es: "+ perimetro+" aproximadamente");
    }

    void areaHexagono(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el perímetro del hexágono: ");
        int perimetro = obj.nextInt();
        System.out.println("Ingrese la apotema del hexágono: ");
        int apotema = obj.nextInt();

        int resultado = (perimetro*apotema)/2;

        System.out.println("El area de su hexágono es de: "+resultado);


    }


    void promXNum (){
        Scanner obj = new Scanner(System.in);
        System.out.println("Cuántos numeros desea introducir?");
        int n = obj.nextInt();

        if (n<=0){
            System.out.println("La cantidad a ingresar debe ser mayor a 0");

        }else{
            int suma=0;
            for (int i=1; i<=n;i++){
                System.out.println("Ingrese el "+i+"numero de "+n);
                int nums = obj.nextInt();
                suma += nums;

            }

            double prom = suma/n;
            System.out.println("EL promedio de los numeros ingresados es: "+prom);
        }

    }

    public static int distPuntos(){
        return 0;

    }

    void numConsecutivos(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        String n = obj.next();

        String s1 = n;
        String s2 = n+n;
        String s3 = n+n+n;

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = Integer.parseInt(s3);
        int suma = num1+num2+num3;

        System.out.println("Los numeros son: "+s1+", "+s2+" y "+s3);
        System.out.println("Y la suma entre ellos es "+suma);


    }

    void segundosReloj (){

        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos que quiere convertir");
        int seg = obj.nextInt();

        double conversiónMin = seg/60;
        double horas= conversiónMin /60;


        System.out.println("Los segundos proporcionados convertidos son: "+horas+":");



    }
























}
