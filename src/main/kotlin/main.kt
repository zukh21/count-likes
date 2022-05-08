fun main(){
    var likes = 5461
    var lastDigit = likes % 10
    val odd = intArrayOf(1,3,5,7,9)
    val even = intArrayOf(2,4,6,8)
    println(lastDigit)
    if (lastDigit in odd){
        println("Понравилось ${likes} человеку!")
    }else if(lastDigit in even){
        println("Понравилось ${likes} людям!")
    }
}