// 135
// StreamingMarkupBuilder
def xml = new groovy.xml.StreamingMarkupBuilder()

def markup = {
  customers {
    customer(id:1001){
      name(firstName:"Fred", surname:"Filecstone,come")
      address(streat:"1 rock road.", city:"Bedrock")
    }
    customer(id:1002){
      name(firstName:"Top", surname:"comeos,ecome")
      address(streat:"come,hehuaci", city:"cz")
    }
  }
}

println xml.bind(markup)
