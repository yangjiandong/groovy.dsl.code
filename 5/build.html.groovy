//138
//build HTML
def html = new groovy.xml.MarkupBuilder()

html.html{
  head{
    title "Groovy Builders"
  }
  body{
    h1 "Groovy Builders are cool!!"
  }
}
