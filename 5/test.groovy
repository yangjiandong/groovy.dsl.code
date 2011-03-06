def transfer( transaction, amount){
  println """ debiting ${amount} from ${transaction.from} account,
  crediting ${transaction.to} for ${transaction.for} """
}

transfer 1000.00, from:"checking",to:"savings", for:"Joe Bloggs"
