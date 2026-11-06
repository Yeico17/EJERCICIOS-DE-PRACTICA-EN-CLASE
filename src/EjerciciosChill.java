import javax.swing.*;
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
        float dec= num-ent;

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
    //primer commit (se me olvidó crear el repositorio antes)

    void segundosReloj (){

        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos que quiere convertir");
        int seg = obj.nextInt();

        int horas = seg/3600;
        int segundosFaltantes = seg%3600;
        int minutos= segundosFaltantes / 60;
        int segundos= segundosFaltantes %60;

        String resultadoFormateado = String.format("%02d:%02d:%02d", horas, minutos, segundos);



        System.out.println("Los segundos proporcionados son: "+seg);
        System.out.println("Reloj:");
        System.out.println(resultadoFormateado);
        //System.out.println("Su reloj es:"+horas+":"+minutos+":"+segundos);

    }

    //PARTE 2

    void parImpar (){

        Scanner obj = new Scanner(System.in);
        System.out.println("Digite el número a probar:");
        int num = obj.nextInt();
        int check = num%2;

        if (check==0){
            System.out.println("El número es par");

        }else{
            System.out.println("El número es impar");

        }
    }

    void posNeg (){
        Scanner obj = new Scanner(System.in);
        System.out.println("Digite un número:");
        int num = obj.nextInt();

        if (num<0){
            System.out.println("El número es negativo");

        }else if (num==0){


            System.out.println("El número digitado es cero");
        }else{

            System.out.println("El número es positivo");
        }

    }

    void detIva(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el precio de la venta:");
        int precio = obj.nextInt();

        double iva = calcularIVA(precio);
        System.out.println("Cálculo IVA: "+iva);

        if (iva>150000){
            double descuento= iva*0.95;
            System.out.println("Producto con descuento aplicable del 5%");
            System.out.println("iva final: "+descuento);

        }else{

            System.out.println("Descuento del 5% no aplicable");
        }
    }
    public static double funcionNotaFinal(double nota1,double nota2,double nota3,double nota4,double nota5) {

        double resultado = (nota1*0.15)+(nota2*0.2)+(nota3*0.15)+(nota4*0.3)+(nota5*0.2);
        System.out.println("Su nota final es de: "+ resultado);
        return resultado;

    }


    void aprobar (){
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

        double rAprobado = funcionNotaFinal(nota1,nota2,nota3,nota4,nota5);

        if (rAprobado<2){
            System.out.println("Su nota es menor a 2.0, usted no puede habilitar");

        }else if (rAprobado<3 && rAprobado>=3){
            System.out.println("Su nota es menor a 3.0, usted reprobó");


        }else if (rAprobado>=3 && rAprobado<4.5){
            System.out.println("Nota aprobada");


        }else if (rAprobado>4.5){
            System.out.println("¡Felicitaciones! su nota demuestra que usted es excelente");

        }
    }


    public static void resolverEcuacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: 'a' no puede ser 0.");
            return;
        }

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Tiene soluciones complejas.");
        }
        scanner.close();
    }

    public void verificarLogin() {
        Scanner sc = new Scanner(System.in);
        String usuarioAdmin = "jacobo";
        String passAdmin = "xd";

        System.out.print("Ingrese usuario: ");
        String user = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String pass = sc.nextLine();


        if (user.equals(usuarioAdmin) && pass.equals(passAdmin)) {
            System.out.println("¡Acceso concedido! Bienvenid@.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }

    public void nombreNumero(int n) {
        switch (n) {
            case 0: System.out.println("CERO"); break;
            case 1: System.out.println("UNO"); break;
            case 2: System.out.println("DOS"); break;
            case 3: System.out.println("TRES"); break;
            case 4: System.out.println("CUATRO"); break;
            case 5: System.out.println("CINCO"); break;
            case 6: System.out.println("SEIS"); break;
            case 7: System.out.println("SIETE"); break;
            case 8: System.out.println("OCHO"); break;
            case 9: System.out.println("NUEVE"); break;
            case 10: System.out.println("DIEZ"); break;
            default: System.out.println("Número fuera de rango (0-10).");
        }
    }

    public void contarDigitos(int n) {
        if (n < 0 || n >= 100000) {
            System.out.println("El número debe ser menor a 100,000 y positivo.");
            return;
        }
        String texto = String.valueOf(n);
        System.out.println("El número " + n + " tiene " + texto.length() + " dígitos.");
    }

    public void analizarTendencia(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("Está incrementando.");
        } else if (a > b && b > c) {
            System.out.println("Está disminuyendo.");
        } else {
            System.out.println("Ni se incrementa ni disminuye.");
        }
    }

    public void nombreDia(int dia) {
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día inválido (1-7).");
        }
    }

    public String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }


    public void capitalizarPalabras(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String p : palabras) {
            if (!p.isEmpty()) {
                resultado.append(Character.toUpperCase(p.charAt(0)))
                        .append(p.substring(1)).append(" ");
            }
        }
        System.out.println(resultado.toString().trim());
    }

    public void penultimaPalabra(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        if (palabras.length >= 2) {
            System.out.println("Penúltima palabra: " + palabras[palabras.length - 2]);
        } else {
            System.out.println("El texto no tiene suficientes palabras.");
        }
    }

    public void segundoContienePrimero(String t1, String t2) {
        if (t2.contains(t1)) {
            System.out.println("El segundo texto SÍ contiene al primero.");
        } else {
            System.out.println("El segundo texto NO contiene al primero.");
        }
    }

    public boolean esPalindromo(String palabra) {
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    public double calcularAreaPoligonoRegular(double perimetro, double apotema) {
        return (perimetro * apotema) / 2.0;
    }

    public void imprimirSecuencias() {
        System.out.print("Primeros 10 naturales: ");
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");

        System.out.print("\nPrimeros 10 impares: ");
        for (int i = 1; i <= 20; i += 2) System.out.print(i + " ");

        System.out.print("\nPrimeros 10 pares: ");
        for (int i = 2; i <= 20; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    public int pedirEnteroPositivo() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!sc.hasNextInt()) {
                System.out.print("Valor inválido. Ingrese un entero positivo: ");
                sc.next();
            }
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Error: Debe ser mayor que cero.");
            }
        } while (num <= 0);
        System.out.println("¡Valor válido ingresado: " + num);
        return num;
    }

    public void decimalABinario(int decimal) {
        System.out.println("Binario: " + Integer.toBinaryString(decimal));
    }

    public void binarioADecimal(String binario) {
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("Decimal: " + decimal);
    }

    public void patronNumeros() {
        String acum = "";
        for (int i = 1; i <= 10; i++) {
            acum += i;
            System.out.println(acum);
        }
    }

    public void patronTrianguloSimbolos(int filas) {
        // Patrón de asteriscos decreciente
        for (int i = filas; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void controlarEquipaje() {
        Scanner sc = new Scanner(System.in);
        double pesoTotal = 0;
        int totalBultos = 0;
        double pesoMax = -1;
        double pesoMin = 99999;
        double totalPesosCOP = 0;

        System.out.println("--- Control de Equipaje Boeing 747 (Capacidad 18,000 kg) ---");

        while (true) {
            System.out.print("Ingrese peso del bulto en kg (0 para terminar): ");
            double peso = sc.nextDouble();

            if (peso == 0) break;

            if (peso > 500) {
                System.out.println("Error: Un bulto no puede exceder los 500 kg.");
                continue;
            }

            if ((pesoTotal + peso) > 18000) {
                System.out.println("Error: Se excede la capacidad máxima del avión (18,000 kg).");
                break;
            }

            pesoTotal += peso;
            totalBultos++;

            if (peso > pesoMax) pesoMax = peso;
            if (peso < pesoMin) pesoMin = peso;

            double costoBulto = 0;
            if (peso > 25 && peso <= 300) {
                costoBulto = peso * 1500;
            } else if (peso > 300) {
                costoBulto = peso * 2500;
            }
            totalPesosCOP += costoBulto;
        }

        double promedio = (totalBultos > 0) ? (pesoTotal / totalBultos) : 0;
        double totalDolares = totalPesosCOP / 4000.0; // Tasa estimada de conversión a dólares

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("a. Total de bultos: " + totalBultos);
        System.out.println("b. Bulto más pesado: " + (totalBultos > 0 ? pesoMax : 0) + " kg | Más liviano: " + (totalBultos > 0 ? pesoMin : 0) + " kg");
        System.out.println("c. Peso promedio: " + promedio + " kg");
        System.out.println("d. Ingreso total: $" + totalPesosCOP + " COP | $" + totalDolares + " USD");
    }

    









































}
