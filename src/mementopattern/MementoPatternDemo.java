package mementopattern;

public class MementoPatternDemo {
    
    public static void main(String[] args) {
        VigilanteEscritorArchivo vigilante = new VigilanteEscritorArchivo();
        
        EscritorArchivosUtil escritor = new EscritorArchivosUtil("memento.txt");
        
        escritor.escribir("Primer grupo de datos\n");
        vigilante.guardar(escritor);
        System.out.println("Contenido actual del archivo:\n" + escritor + "\n\n");
        
        escritor.escribir("Segundo grupo de datos\n");
        System.out.println("Contenido actual del archivo:\n" + escritor + "\n\n");
        
        System.out.println("Deshacer\n");
        vigilante.deshacer(escritor);
        System.out.println("Contenido actual del archivo:\n" + escritor);        
    }
}