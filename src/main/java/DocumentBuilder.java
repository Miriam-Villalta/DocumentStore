public class DocumentBuilder {
    private StringBuilder document = new StringBuilder();
    public void addParagraph(String text) {
        // Debe añadir un nuevo párrafo al final del documento.
    }
    public int getaragraphNumber() {
        // Debe retornar cuántos párrafos tiene el documento
        return 0;
    }
    public String getaragraph(int position) {
        // Debe retornar el párrafo de la posición dada contando desde 1, o null
        // si no hay ningún párrafo en esa posición.
        return "";
    }
    public void finishWithPeriod() {
        // Garantiza que todos los párrafos terminarán con un punto.
    }
    public void removeParagraph(int position) {
        // Eliminar el párrafo de la posición dada contando desde 1, o no hace-
        // nada si no hay un párrafo en esa posición
    }
    public void replace(String regex, String other) {
        // El parámetro regex es una expresión regular con la que debe casar aquel
        // texto del documento que queremos sustituir por otro.
    }
}
