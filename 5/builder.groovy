// Builder
def builder = new groovy.xml.MarkupBuilder(
                      new FileWriter("customers.xml"))
def customers = builder.customers {
    customer(id:1001) {
        name(firstName:"Fred",surname:"Flintstone")
        address(street:"1 Rock Road",city:"Bedrock") 
    }
    customer(id:1002) {
        name(firstName:"Barney",surname:"Rubble")
        address(street:"2 Rock Road",city:"Bedrock") 
    }    
}

