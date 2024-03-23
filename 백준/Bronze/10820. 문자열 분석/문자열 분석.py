while True :
    try :
        low, up, num, spa = 0, 0, 0, 0
        text = input()
        for t in text :
            if t.islower() :
                low += 1
            elif t.isupper() :
                up += 1
            elif t.isdigit() :
                num += 1
            else :
                spa += 1
        print(low, up, num, spa)
    except EOFError :
        break