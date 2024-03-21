fun main(){
    word("Akirachix")
    identity("Faith", "Hope")
    var fullName = "Raziah Abdullahi"
    var age = 20
    var weightInKg = 50.5
    var kenyan = true
    var details = fullName+ " " +age+ " " +weightInKg+ " "   +kenyan
    var r = "my name is "
    println(details)
    println(r +details.toString())
    println(r.replace("name","self"))
    println(fullName.replace("Abdullahi","Mohamed"))
    println(r.split(","))
    println(r[1])
    println(r.indexOf("my"))
    println(r.length)
    println(details.lastIndexOf("raziah"))
    println(details.length)
    println(details.slice(0..5)
    )
    name("Akira")



}

fun name(school: String){
    println(school[0])
    println(school[2])
    println(school[3])
    println(school.lastIndexOf("Chix"))



}
fun details(name:String, age : Int): String{
    var sentence= "Hello my name is $name  I am $age years old"
    return(sentence)
    println(name.lastIndexOf(""))
}
fun cm(word:String):Int{
    var length= word.length
    return(length)

}

fun identity(name1:String, name2:String){
    if(name1.equals(name2)){
        println("That's me!")

    }
        else
            println("I do not know who that is")
}
fun word(name:String){
    println(name[0]+"" +name[2]+""+name[3])
}

