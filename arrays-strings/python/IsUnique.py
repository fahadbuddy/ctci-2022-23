def isUnique(test):
    if len(test) > 128 :
        return False

    checker = [False for _ in range(128)]
    for t in test:
        val = ord(t)
        if checker[val]:
            return False
        else:
            checker[val] = True
    
    return True

isUnique("abcde")
