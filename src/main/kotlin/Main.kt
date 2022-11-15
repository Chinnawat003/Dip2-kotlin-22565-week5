fun main(){
    val L1 =  Lamp()
    val L2 =  Lamp()
    val ac = Account()

    L1.turnOn()
    L2.turnOff()

    L1.displayLigth( "L1")
    L2.displayLigth( "L2")

    ac.insert(5555,"Dong",1000000f)
}