fun main() {
    val vertices = 6
    val grafo = Array(vertices) { mutableListOf<Int>() }

    // aristas
    grafo[0].addAll(listOf(1, 2))
    grafo[1].addAll(listOf(0, 3, 4))
    grafo[2].addAll(listOf(0, 5))
    grafo[3].add(1)
    grafo[4].add(1)
    grafo[5].add(2)

    val visitado = BooleanArray(vertices)
    val cola = ArrayDeque<Int>()

    cola.add(0)

    println("Recorrido DFS desde el nodo 0:")

    while (cola.isNotEmpty()) {
        val actual = cola.removeLast() // usar como pila
        if (!visitado[actual]) {
            print("$actual ")
            visitado[actual] = true
            for (vecino in grafo[actual]) {
                if (!visitado[vecino]) cola.add(vecino)
            }
        }
    }
}