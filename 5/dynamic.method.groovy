//dynamica method
//166
class Customer{
  def firstName
  def lastName
  def address1
  def address2
} 

def c = new Customer()

c.properties.keySet().findAll{!(it =~ /lass/) }.each{
  Customer.metaClass."print_${it}" = {-> println delegate."${it}"}
}

def cust = new Customer(firstName:"Fred",
  lastName:"Flintstone",
  address1:"Rock raod",
  address2:"BedRock"
)

cust.print_firstName();
cust.print_lastName()
