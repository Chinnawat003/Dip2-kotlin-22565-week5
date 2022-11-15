class Lamp {
    //-------------
    var inOn: Boolean = false


    fun turnOn() {
        inOn = true
        println(inOn)
    }

    fun turnOff() {
        inOn = false
        println(inOn)
    }
    fun displayLigth(lamp: String) {
        if(inOn == true ){
            println("$inOn Lamp is on")
        }else{
            println("$inOn Lamp is off")
        }
    }
}