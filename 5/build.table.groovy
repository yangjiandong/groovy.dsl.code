//140
//build table
def html = new groovy.xml.MarkupBuilder()
html.html {
  head {
    title "Groovy Builders"
  }
  body {
    table(border:1) {
      tr {
        th "Builder class"
        th "Concrete class"
      }
      tr {
        td "groovy.util.BuilderSupport"
        td {
          table { 
            tr {
              td "groovy.util.AntBuilder"
            }
            tr {
              td "groovy.xml.MarkupBuilder"
            }
          }
        }
      }
      tr {
        td "groovy.util.FactoryBuilderSupport"
        td {
          table { 
            tr {
              td "groovy.util.NodeBuilder"
            }
            tr {
              td "groovy.swing.SwingBuilder"
            }
          }
        }
      }
    }
  }
}

