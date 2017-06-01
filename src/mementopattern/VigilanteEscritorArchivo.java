package mementopattern;

public class VigilanteEscritorArchivo {
    private Object objeto;
    
    public void guardar(EscritorArchivosUtil esctritorArchivo) {
        objeto = esctritorArchivo.guardar();
    }
    
    public void deshacer(EscritorArchivosUtil esctritorArchivo) {
        esctritorArchivo.deshacerGuardar(objeto);
    }
}
