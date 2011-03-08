//metaclass
//157

//159
//invokeMethod
//拦截方法

class Customer{
  int id
  String firstName
  String surname
  String street
  String city

  Object invokeMethod(String name, Object args){
    if (name == 'prettyPrint'){
      println "Customer has following properties"
      this.properties.each{
        println "   " + it.key +" : "+it.value
      }
    }
    if (name == 'prettyPrint2'){
      println "Customer has not this method!!!"
      //      this.properties.each{
      //        println "   " + it.key +" : "+it.value
      //      }
    }
  }
}

def fred = new Customer(id:1001, firstName:"Fred",
surname:"Flintstone",
street: "1 Rock Road", city:"BedRock")

def barney = new Customer(id:1002, firstName:"Barney",
surname:"Rubble",
street:"3 Rock socme road", city:"Bedrock")

def customerList = [fred, barney]

//invokeMethod
customerList.each{
  it.prettyPrint()
  it.prettyPrint2()
}

