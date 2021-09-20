import kotlin.random.Random
fun main(){
    val num = Random.nextInt(0,10)
    var num1 = 0
    var num2 = 0
    var check = 0
    while(check!=1){
        try {
            print("Enter your first number: ")
            num1 = readLine()!!.toInt()
            print("Enter your second number: ")
            num2 = readLine()!!.toInt()
            check++
        }
        catch(e: Exception){
            println("Please enter numbers only!")
        }}
    println("$num1 * X + $num2 = "+(num1*num+num2))
    while(check!=2){
    try{
        print("What is X? >> ")
        if(readLine()!!.toInt()==num){
            println("You got it!")
        }
        else{
            println("Wrong answer!")
        }
        check++
    }
    catch (e: Exception){
        println("Please enter numbers only!")
    }}
}


