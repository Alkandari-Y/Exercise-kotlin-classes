fun main() {
    var survivalGuide = Book(
        "Zombie Survival Guide",
        "Max Brooks",
        2003
    );

    println(survivalGuide.title)
}

class Book(var title: String, var author: String, var yearPublished: Int) {}