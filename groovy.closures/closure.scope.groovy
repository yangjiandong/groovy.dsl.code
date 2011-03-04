//91
def greeting(name){
  def salutation ="Hello";
  def greeter = {println salutation + ", "+ name; }
  greeter()
}

greeting("Dolly")

class Greeter{
  def separator =", "
  def greeting(name){
    def salutation = "Hello";
    def greeter = {println salutation + separator + name}
    greeter()
  }
}

Greeter greeter = new Greeter()
greeter.greeting("Dolly")

//93
class MyClass{
  def member = "original";
  def method(String param){
    def local = member;

    return {
      println "Member: " + member +
              " Local: " + local +
              " Parameter: " + param
    }
  }
}

MyClass myClazz = new MyClass();
def clos1 = myClazz.method("First");
clos1();

myClazz.member = "modified";
def clos2 = myClazz.method("Second");
clos2()
clos1()

