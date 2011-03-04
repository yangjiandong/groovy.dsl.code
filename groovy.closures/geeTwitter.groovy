import twitter4j.*

// p111
class GeeTwitter{
  
  // p117
  static {
    String.metaClass.search = { Closure c ->
      search(delegate c)
    }
  }

  static twitter = null;

  // establish connection with twitter service
  static login(id, password){
    twitter = new Twitter(id, password)
  }

  static sendMessage(id, message){
    twitter.sendDirectMessage(id, message)  
  }

  // closure to each friend
  static eachMessage(Closure c){
    twitter.directMessages.each{
      c.call(it.senderScreenName, it.text)
    }
  }

  // closure to each firend
  static void eachFirend(Closure c){
    twitter.friends.each{
      c.call(it.screenName)
    }
  }

  // closure to each follower
  static void eachFollower(Closure c){
    twitter.followers.each{
      c.call(it.screenName)
    }
  }

  // follow another twitter
  static void follow(user){
    try{
      twitter.createFriendship(
        "${twitter.getUserDetail(user).getId()}"
      )
    }catch(e){
    }
  }

  static void search(terms, Closure c){
    if (!twitter)
      twitter = new Twitter()

      def query = new Query(terms)
      twitter.search(query).tweets.each{
        c.call(it.fromUser, it.text)
      }
  }
}

// p116
String.metaClass.search = {
  Closure c ->
    GeeTwitter.search(delegate, c)
}

String searchTerms = "Groovy DSL";
searchTerms.search{fromUser, message ->
  println fromUser + ": " + message
}

// searchClosure searchMethod
Closure searchClosure = { Closure c ->
  GeeTwitter.search(delegat, c)
}

String.metaClass.search2 = searchClosure
String searchTerms2 = "Groovy dsl"
closure = {from, tweet ->
  println from + ": " + tweet
}
searchMethod = searchTerms2.&search2
searchMethod.call(closure)

// p121
