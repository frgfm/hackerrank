bracket_dict = {"{":"}","[":"]","(":")"}

def is_matched(expression):
#    if(len(expression)%2)>0:
#        return False
    s = []
    for letter in expression:
        if letter in bracket_dict.keys():
            s.append(bracket_dict[letter])
        else:
            if s == [] or letter != s.pop():
                return False
    return (s == [])    

t = int(input().strip())
for a0 in range(t):
    expression = input().strip()
    if is_matched(expression) == True:
        print("YES")
    else:
        print("NO")
