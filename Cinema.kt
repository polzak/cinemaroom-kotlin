
fun main() {
    val rowNum = 7
    val colNum = 8
    val wholeSeats = generateSeats(rowNum * colNum)
    displaySeats(colNum, wholeSeats)
}

// Array of the whole seats
fun generateSeats(n: Int): CharArray {
    val seats = CharArray(n)
    for (i in 0 until n) {
        seats[i] = 'S'
    }
    return seats
}

// Display the seats in a given format
fun displaySeats(col: Int, seats: CharArray) {
    println("Cinema:")
    for (c in 0..col) {
        if (c == 0) {
            print("  ")
            continue
        }
        print("$c ")
    }
    println()

    for (i in 0 until seats.size) {
        if (i % col == 0) {
            print("${i / col + 1} ${seats[i]} ")
        } else if (i % col == col - 1) {
            println("${seats[i]} ")
        } else {
            print("${seats[i]} ")
        }
    }
}
