Finding Prime factors:
'''
List Of Integer: FindFactors(Integer: number)
List Of Integer: factors
// Pull out factors of 2.
While (number Mod 2 == 0)
factors.Add(2)
number = number / 2
End While
// Look for odd factors.
Integer: i = 3
Integer: max_factor = Sqrt(number)
While (i <= max_factor)
// Pull out factors of i.
While (number Mod i == 0)
// i is a factor. Add it to the list.
factors.Add(i)
// Divide the number by i.
number = number / i
// Set a new upper bound.
max_factor = Sqrt(number)
End While
// Check the next possible odd factor.
i = i + 2
End While
// If there's anything left of the number, it is a factor, too.
If (number > 1) Then factors.Add(number)
Return factors
End FindFactors
'''

def prime_factors(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors
