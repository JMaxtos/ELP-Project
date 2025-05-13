package elp

data class XQL(val init: Init, val atributes: List<Atribute>){

}

data class Init( val load : String = "load", val argument: Argument, val to : String ="to", val document : String ){

}

data class Atribute(val variable: String, val equal : String = "=" , val value : String ){
}

sealed interface Function

data class DotX(val part1: String, val part2: String) : Function
data class DotXArr(val dotX: DotX, val index: Int) : Function
data class DotXArrDot(val dotX:DotX, val item: String) : Function

data  class Argument ( val name: String)
