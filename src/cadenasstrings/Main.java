
package cadenasstrings;


public class Main {

    public void contar(String palabra){
        palabra = "Hola";
        System.out.println("El tamaño es: "+palabra.length());;
    }
    
    public void obtenerCaracter(){
        String mensaje = "Hola Mundo";
        char lentraH = mensaje.charAt(0);
        //obtener la posicion:
        System.out.println("Posicion 0 en la variable es LetraH :"+lentraH);
    }
    
    public void indice(){
        String mensaje = "Hola Mundo";
        int indice = mensaje.indexOf("M");
        System.out.println("Retorna el indice del caracter a buscar "+indice);     
    }
    
    public void buscarAPartirIndice(){
        String mensaje = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje.indexOf("a");
        int indiceSegundaA = mensaje.indexOf("a",  indicePrimeraA + 1 );
        System.out.println("Indice de la primera letra 'a': "+indicePrimeraA);
        System.out.println("Indice de la segunda letra 'a': "+indiceSegundaA);
    }
    
    public void indiceInicial(){
        String mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M");
        String subString = mensaje.substring(indiceLetraM);
        System.out.println(subString);
    
    }
    
    public void indiceInicialFinal(){
        String mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M"); 
        String subString = mensaje.substring(indiceLetraM, indiceLetraM + 2);
        System.out.println(subString);
    
    }
   
    public static void main(String[] args) {
       Main obj = new Main();
        obj.contar("");
        obj.obtenerCaracter();
        obj.indice();
        obj.buscarAPartirIndice();
        obj.indiceInicial();
        obj.indiceInicialFinal();
    }
    
}
