def GCD(a,b):

    while(b != 0):
        remainder = a % b
        a = b
        b = remainder
    return a

print "gcd " + str(GCD(500,245))

def LCM(a,b):
      return ((a * b) / GCD(a,b))
print "LCM "+ str( LCM(500,245))


#GCD(a,b) = |axb|/LCM(a,b)
#LCM(a,b)=|axb|/GCD(a,b)
