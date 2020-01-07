
var articles:MutableList<String> = mutableListOf("Banane","Orange","Biscuit","Viande","Oeuf","Oignon","Poisson")


fun afficherStock(){
    println()
    println("""
        -----------------------------
            Liste des articles
        -----------------------------
    """.trimIndent())
    articles.forEach{println(it)}
    println("-----------------------------")
    println()
}

fun ajouterArticle(){
    print("Nom de l'article > ")
    var nom_article = readLine()!!.toString()
    articles.add(nom_article)
    println("Article ajouter")
}

fun supprimerArticle(){
    print("Nom de l'article > ")
    var nom_article = readLine()!!.toString()
    if (articles.contains(nom_article)){
        articles.remove(nom_article)
        println("Article supprimer")
        return
    }
    println("Le stock ne contiens pas cet articles")
}

fun modifierArticle(){
    print("Nom de l'articles > ")
    var article = readLine()!!.toString()
    if (articles.contains(article)){
        var index:Int = articles.indexOf(article)
        println("Nom > ")
        article = readLine()!!.toString()
        articles.set(index, article)
        println("Article modifier")
        return
    }
    print("Le stock ne contiens pas cet articles")
}

fun main() {

    first@ while (true){
        print("""
        1 - Afficher le stock
        2 - Ajouter un article
        3 - Supprimer un article
        4 - Modifier un article
        5 - Quitter
        
    """.trimIndent())
        print("Choisir une option > ")

        var choix = readLine()!!.toInt()
        when(choix){

            1 -> afficherStock()
            2 -> ajouterArticle()
            3 -> supprimerArticle()
            4 -> modifierArticle()
            5 -> break@first
            else -> println("Choix non compris")
        }
    }
}