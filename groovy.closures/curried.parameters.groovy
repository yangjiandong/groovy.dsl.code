//90
def indian ={style,meat,rice ->
  return "${meat} ${style} with ${rice} rice."
}

def vindaloo = indian.curry("Vindaoo")
def korma = indian.curry("Korma")

assert Vindaoo("Chicen", "Fried") == 
  "Chicen Vindaoo with Fried rice."

assert korma("Lamb", "Boiled") == "Lamb Korma with Boiled rice."  
