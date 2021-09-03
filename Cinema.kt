
fun main() {
    println("Enter the number of rows:")
    val rowNum = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val colNum = readLine()!!.toInt()
    //val cinemaSeats = generateSeats(rowNum * colNum)

    val totalIncome = calculateIncome(rowNum, colNum)
    println("Total income:")
    println("\$$totalIncome")

    //displaySeats(colNum, cinemaSeats)
}

// Calculate the income of seats when they are all sold
fun calculateIncome(row: Int, col: Int): Int {
    val wholeSeatNumber = row * col
    var income = 0

    if (wholeSeatNumber <= 60) {
        income = wholeSeatNumber * 10
    } else {
        val frontRow = row / 2
        income = frontRow * col * 10 + (row - frontRow) * col * 8
    }
    return income
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
