// p79
def closureMethodString(String s, Closure c){
  println "Greet someone"
  c.call(s)
}

closureMethodString("Doly"){
  name ->
    println "Hello, ${name}"
}
