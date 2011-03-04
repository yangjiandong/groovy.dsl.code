// twitter-4j-2.0.3
import twitter4j.*

def twitterid = "young.jiandong@gmail.com"
def pasw = "asdfghjkl"

def twitter = new Twitter(twitterid, pasw)

twitter.updateStatus("Updating my status via the Twitter4j APIS")

println twitter.getUserDetail(twitterid).getStatusText()