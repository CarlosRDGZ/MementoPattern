package mementopattern;

public class EscritorArchivosUtil {
    private String nombreArchivo;
    private StringBuilder contenido;
    
    public EscritorArchivosUtil(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        contenido = new StringBuilder();
    }
    
    @Override
    public String toString() {
        return contenido.toString();
    }
    
    public void escribir(String texto) {
        contenido.append(texto);
    }
    
    public Memento guardar() {
        return new Memento(nombreArchivo, contenido);
    }
    
    public void deshacerGuardar(Object objeto) {
        Memento memento = (Memento) objeto;
        this.nombreArchivo = memento.nombreArchivo;
        this.contenido = memento.contenido;        
    }
    
    private class Memento {
        private String nombreArchivo;
        private StringBuilder contenido;
        
        public Memento(String nombreArchivo, StringBuilder contenido) {
            this.nombreArchivo = nombreArchivo;
            this.contenido = new StringBuilder(contenido);
        }
    }
}
