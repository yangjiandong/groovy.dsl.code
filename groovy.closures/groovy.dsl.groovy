// GROOVY DSL
// 99
// search twitter 'Groovy DSL'
// Guillame LaForge
// search Groovy: curl http://search.twitter.com/search.json?q=Groovy

// p106
import twitter4j.*

def twitterId = "";
def password = "";

def twitter = new Twitter(twitterId, password)

// method to apply a closure to each friend
static void eachFriend(Closure c){
  twitter.friends.each{
    c.call(it.screenName)
  }
}

// each follower
static void eachFollower(Closure c){
  twitter.followers.each{
    c.call(it.screenName)
  }
}

// follow another twitter user
void follow(twitter, user){
  twitter.createFriendship("${twitter.getUserDetail(user).getId()}")
}
