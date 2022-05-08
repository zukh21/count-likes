fun main(){
    var likes: Int = 5443
    var lastDigit = likes % 10
    var twoLastDigit = likes % 100
    if (lastDigit == 1 && twoLastDigit != 11){
        println("Понравилось ${likes} человеку!")
    }else if(twoLastDigit == 11){
        println("Понравилось ${likes} людям!")
    }else if (likes == 0){
        println("Пока у вас лайки нету!")
    }
    else{
        println("Понравилось ${likes} людям!")
    }
}