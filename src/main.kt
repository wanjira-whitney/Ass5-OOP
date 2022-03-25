fun main (){
    var Marsha = Human("Marsha",19,45)
    Marsha.eat(5)
    println(Marsha.weight)
    Marsha.speak("I love AkiraChix")
    Marsha.birthday()

    var student = User("kimmy","world","kimmyworld",7166246,"kimney")
        println(student.email)
        println(student.firstName)

}

class Human(var name: String, var age: Int, var weight: Int){

    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight

    }
    fun speak(speech: String){
        println(speech)

    }
    fun birthday(){
        age++
    }
}
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var password: String) {

}