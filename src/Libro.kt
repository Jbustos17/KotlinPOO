class Libro {

    var titulo: String = ""
    var autor: String = ""
    var isbn: String = ""
    var numeroDePaginas: Int = 0
    var precio: Double = 0.0
    var cantidadDisponible: Int = 0

    constructor()
    constructor(
        titulo: String,
        autor: String,
        isbn: String,
        numeroDePaginas: Int,
        precio: Double,
        cantidadDisponible: Int
    ) {
        this.titulo = titulo
        this.autor = autor
        this.isbn = isbn
        this.numeroDePaginas = numeroDePaginas
        this.precio = precio
        this.cantidadDisponible = cantidadDisponible
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', isbn='$isbn', numeroDePaginas=$numeroDePaginas, precio=$precio, cantidadDisponible=$cantidadDisponible)"
    }

    fun prestarLibro(): Boolean {
        return if (cantidadDisponible > 0) {
            cantidadDisponible--
            println("Libro prestado con exito.")
            true
        } else {
            println("No hay ejemplares disponibles para prestar.")
            false
        }
    }
    fun devolverLibro() {
        cantidadDisponible++
        println("Libro devuelto con exito.")
    }
    fun mostrarInformacion() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("ISBN: $isbn")
        println("Número de páginas: $numeroDePaginas")
        println("Precio: $$precio")
        println("Cantidad disponible: $cantidadDisponible")
        println("...............................")
    }

}
