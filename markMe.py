import re
from operator import itemgetter
from getKeywords import *
from readMS import *
print('Welcome to markMe!')
kw = getKeywords().getKeys()


def getKeyOrder(classes):
    keywordorder = []
    for i in range (0, len(classes)):
        print("-----------------------------------------")
        for k in range (0,len(kw)):        
            word = re.search(kw[k], classes[i], flags=0)            
            if word:
                
                keywordorder.append([i,k,word.span()[0]])

    return keywordorder
    
def getKeyOrderA(ans):
    keywordorder = []
    for k in range (0,len(kw)):        
        word = re.search(kw[k], ans, flags=0)
        if word:
            
            keywordorder.append([k,word.span()[0]])

    return keywordorder





q1 = readMS('questions/2a/Beta01.java')
ans = open('IT18151152/Beta01/src/beta01/IShow.java')
a = ans.read()
an = []

for i in range(0,len(kw)):
    word = re.search(kw[i], a, flags=0)
    if word:
        an.append([i,word.span()[0]])

na = sorted(an,key = itemgetter(1))
#print(na)

print('----------------------------------')
cls = q1.classSplit();
marks = q1.getMsMarks(cls);
keys = getKeyOrder(cls)
keys = sorted(keys, key = itemgetter(0,2))
#ansKeys = getKeyOrder(ans)
#ansKeys = sorted(ansKeys, ansKeys = itemgetter(0,2))
#print(ans)

#print(kw[31])
#print(kw[34])
#print(kw[8])
#print(keywordorder)

for j in range(0,len(keys)):
    print(kw[keys[j][1]])
    




    








