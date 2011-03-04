//p81
class CThread extends Thread{
  Closure closure

  CThread( Closure c){
    this.closure = c;
    this.start();

  }

  public void run(){
    if (closure)
      closure()
  }
}

CThread up = new CThread(
  {
    [1..9]*.each{
      sleep(100);
      //println "to:";
      println it;
    }
  }
)

up.run()
