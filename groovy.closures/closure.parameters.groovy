def list = [1,3,5,7]
def defautParams = {println it;}
def dynamicParams = { something -> println something}
def intParams = {int something -> println something;}
def stringParams = {String something -> println something;}

list.each defautParams
list.each dynamicParams
list.each intParams
list.each stringParams//fails

//85

//86
def stringParams = {String something -> println something;}

class Closure3 extends groovy.lang.Closure{
  def doCall(String s){}
}

closure3 = new Closure3()
closure3.doCall("hello")
