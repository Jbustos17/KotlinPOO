
fun main() {
    val libros = mutableListOf( // crea una lista mutable

        Libro("Las Mañanitas", "JUAN CAPURRO", "345f", 560, 10.000, 2),
        Libro("Cantores de chipuco", "JUAN BUSTOS", "567f", 100, 30.000, 6),
        Libro("Fútbol", "OMAR RODRIGUEZ", "534f", 120, 50.000, 6),
    )

    while (true) {
        println("1. Mostrar libros disponibles")
        println("2. Prestar un libro")
        println("3. Devolver un libro")

        when (readLine()?.toIntOrNull()) {
            1 -> libros.forEach { it.mostrarInformacion() }
            2 -> {
                print("Ingrese el ISBN del libro a prestar: ")
                val isbn = readLine()
                val libro = libros.find  { it.isbn == isbn }
                if (libro != null) {
                    libro.prestarLibro()
                } else {
                    println("Libro no encontrado.")
                }
            }
            3 -> {
                print("Ingrese el ISBN del libro a devolver: ")
                val isbn = readLine()
                val libro = libros.find { it.isbn == isbn }
                if (libro != null) {
                    libro.devolverLibro()
                } else {
                    println("Libro no encontrado.")
                }
            }

        }
    }
}
