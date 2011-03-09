// owner builder
// 163
class PoorMansTagBuilder{
  int indent = 0
  Object invokeMethod(String name, Object args){
    indent.times {print "  "}
    println "<${name}>"
    indent ++
    args[0].delegate = this
    args[0].call()
    indent --
    indent.times {print "  "}
    println "</${name}>"
  }
}

def builder = new PoorMansTagBuilder()

builder.root{
  level1{
    level2{
    }
  }
}
