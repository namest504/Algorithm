val = []
for i in range(5) :
    val.append(int(input()))
val.sort()
print(sum(val)//len(val))
print(val[2])