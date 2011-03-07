//141
//using program logic with builders
def builder = new groovy.xml.MarkupBuilder()
class Customer {
    int id
    String firstName
    String surname
    String street
    String city
}
def fred = new Customer(id:1001,firstName:"Fred", 
surname:"Flintstone",
street:"1 Rock Road",city:"Bedrock")
def barney =  new Customer(id:1002,firstName:"Barney", 
surname:"Rubble",
street:"2 Rock Road",city:"Bedrock")
def customerList = [ fred, barney]
    
def customers = builder.customers {
    for (cust in customerList) {
        customer(id:cust.id) {
            name(firstName:cust.firstName,surname:cust.surname)
            address(street:cust.street, city:cust.city) 
        }
    }
}

