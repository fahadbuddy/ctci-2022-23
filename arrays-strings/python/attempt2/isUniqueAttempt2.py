def  isUnique2(totest):
    if len(totest) > 128:
        return False

    checker = [False for _ in range(128)]
    for t in totest:
        
        idx = ord(t)
        
        if checker[idx]:
            return False
        
        checker[idx] = True
    return True

print(isUnique2("abcde"))
print(isUnique2("a"))
print(isUnique2("aaaa"))
print(isUnique2("abca"))

def isUnique3(totest):
    if len(totest) < 2:
        return True
    sortedTest = sorted(totest) ## creates a new DS, a list type
    # p = sortedTest[0]
    # for t in sortedTest[1:]:  ## This is OK, python copies the references not the values 
    #     if p == t: 
    #         return False
    #     else:
    #         p = t 

    idx = 0
    p = sortedTest[idx]
    idx = idx + 1
    while (idx < len(sortedTest)):
        if p == sortedTest[idx]:
            return False
        else:
            p = sortedTest[idx]
        idx = idx + 1

    return True    

print(isUnique3("abcde"))
print(isUnique3("a"))
print(isUnique3("aaaa"))
print(isUnique3("abca"))