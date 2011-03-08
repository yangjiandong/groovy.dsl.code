// 155
//categories

class Customer{
  int id
  String firstName
  String surname
  String street
  String city
}

def fred = new Customer(id:1001, firstName:"Fred",
surname:"Flintstone",
street: "1 Rock Road", city:"BedRock")

def barney = new Customer(id:1002, firstName:"Barney",
surname:"Rubble",
street:"3 Rock socme road", city:"Bedrock")

def customerList = [fred, barney]

class CustomerPrinter{
  static void prettyPrint(Customer self){
    println "Customer has following properties"
    self.properties.each{
      if (it.key != 'prettyPrint')
        println "   " + it.key + ": " +it.value
    }
  }
}

use(CustomerPrinter){
  for (customer in customerList)
    customer.prettyPrint()
}

// import org.apache.commons.lang.StringUtils
// use (StringUtils) {
    // "org.apache.commons.lang".split(".").each { println it }
// }

