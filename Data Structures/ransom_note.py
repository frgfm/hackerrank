def ransom_note(magazine, ransom):
    wordcount = {}
    for word in magazine:
        if word in wordcount:
            wordcount[word] = wordcount[word] + 1
        else:
            wordcount[word] = 1
            
    for word in ransom:
        if (word in ransom) & (word in wordcount) & (wordcount[word] > 0):
            wordcount[word] = wordcount[word] - 1
        else:
            return False
    return True    

m, n = map(int, input().strip().split(' '))
magazine = input().strip().split(' ')
ransom = input().strip().split(' ')
answer = ransom_note(magazine, ransom)
if(answer):
    print("Yes")
else:
    print("No")
    
