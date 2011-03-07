// 153
// Expando
def customer = new Expando()
assert customer.properties == [:]
assert customer.id == null
assert customer.properties == [:]

customer.id = 1001
customer.firstName = "Fred"
customer.surname = "Filntstome"
customer.street = "1 Rock Road"

assert customer.id == 1001
assert customer.properties == [
  id: 1001, 
  firstName: 'Fred',
  surname: 'Filntstome',
  street:'1 Rock Road'
]

customer.properties.each{println it}
