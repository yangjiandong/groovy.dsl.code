// Namespaced XML
// 134
def xml = new groovy.xml.MarkupBuilder()

def params = [:]

params."xmlns:bk" = "urn:loc.gov:book"
params."xmlns:isbn" = "urn:ISBN:0-393-36341-6"

//def bk_tag = "bk:book"
xml."bk:book"(params){
  "bk:title"("Cheaper by the Dozen")
  "isbn:number"(1568491379)
}
