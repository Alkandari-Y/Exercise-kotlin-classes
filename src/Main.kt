fun main() {
    val survivalGuide = Book(
        "Zombie Survival Guide",
        "Max Brooks",
        2003,
        "non-fiction"
    );

    println(survivalGuide.getBookInfo())
}

class Book(
    var title: String,
    var author: String,
    var yearPublished: Int,
    var genre: String = "fiction"
) {

    fun getBookInfo(): String{
        return "$genre: $title by $author ($yearPublished)"
    }
}