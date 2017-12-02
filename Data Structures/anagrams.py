def number_needed(a, b):
    import string
    alphacount = dict.fromkeys(string.ascii_lowercase, 0);
    for letter in a:
        alphacount[letter] = alphacount[letter]+1
    for letter in b:
        alphacount[letter] = alphacount[letter]-1
    diff = 0
    for key, value in alphacount.items():
        diff = diff + abs(value)
    return diff    
        

a = input().strip()
b = input().strip()

print(number_needed(a, b))
