fun main() {
    var survivalGuide = Book();
    survivalGuide.title = "Zombie Survival Guide";
    survivalGuide.author = "Max Brooks";
    survivalGuide.yearPublished = 2003;
}

class Book() {
    var title: String = "";
    var author: String = "";
    var yearPublished: Int = 1990
}