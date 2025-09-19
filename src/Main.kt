fun main(){
    val p1 = Person(name = "Ali")
    val p2 = Person(name = "Bilal", age = 23)
    val p3 = Person (name = "Kalam", age = 32, email = "taharajput33@yahoo.com")
    p1.introduce()
    p2.introduce()
    p3.introduce()
}
class Person(val name: String){
    var age: Int = 0
    var email: String = ""
    constructor(name: String, age: Int): this (name){
        this.age = age
    }
    constructor(name: String, age: Int, email: String) : this (name, age){
        this.email = email
    }
    fun introduce() {
        println("Hi, My age is $age and email address is $email")
    }
}