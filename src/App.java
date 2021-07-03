public class App {

    private String nombre;
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda;

    public static void main(String[] args) throws Exception {
        // operadores aritmeticos
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        // operadores unarios
        // trabajan con el valor de una unica variable
        resultado++;
        resultado = resultado + 1;
        resultado--;
        resultado = -resultado;
        resultado = +resultado;
        // operadores logicos
        boolean respuesta = 5 > 4;
        // para regar una condicion se usa !
        respuesta = 25 != 12;
        // operador de igualdad
        respuesta = true;
        // el y
        respuesta = 15 > 12 && 5 < 2;
        // el o
        respuesta = 15 > 12 || 5 < 2;
        // Operadores bit a bit
        // &
        // ^ compuerta logica a sort y elevar al cuadrado
        // |
        // --------------------------
        // estructuras de control
        if (respuesta) {
            // resultado si se cumpla la condicion
        }
        if (respuesta) {
            // resultado si se cumpla la condicion
        } else {
            // resultado si se cumpla la condicion
        }
        // la key es el valor que queremos evaluar
        int valor = 3;
        switch (valor) {
            case 1:
                // el break terina la ejecucion del caso
                break;
            case 2:
                // el break terina la ejecucion del caso
                break;
            case 3:
                // el break terina la ejecucion del caso
                break;

            // el default es el else del if
            default:
                break;
            // se usa para romper la funcion el return
        }
        // es como

        while (valor != 3) {
            // bloque de codigo
        }
        do {
            // bloque de codigo
        } while (valor != 3); // ejecuta una vez mas
        // el similar al for de python
        for (String string : args) {
            // bloque de codigo
            // en una lista args va a tomar cada elemento
            // y va hacer algo con ese elemento
        }
        for (int i = 0; i < args.length; i++) {
            // * 3 partes la primera
            // * en donde se declara una variable que sirve para recorrer
            // e incrementar de 1 en 1 o de 2 en 2
            // la segunda parte es una condicion
            // la tercera parte es un incremento
            // ejemplo de for infinito (for(;;){})
            // para subir a github
            // git add para subir los cambios que se hicieron
            // git commit para dejar el registro
            // git push para subir todos los cambios

        }
        System.out.println("Hello, World!");
    }
}
