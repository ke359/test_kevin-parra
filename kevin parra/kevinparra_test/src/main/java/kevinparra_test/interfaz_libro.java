package kevinparra_test;

public class interfaz_libro {
    private int id;
    private String titulo;
    private String descripcion;
    private String unidadesDisponibles;

    // Constructor
    public interfaz_libro(int id, String titulo, String descripcion, String unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(String unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

   
    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        
        interfaz_libro libro1 = new interfaz_libro(1, "El llano en llamas", "", "152");

        
        libro1.imprimirDetalles();
    }
}
