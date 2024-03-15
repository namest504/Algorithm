import sys

X = int(sys.stdin.readline())

line = 0
end = 0
while X > end :
    line += 1
    end += line

diff = end - X
if line % 2 == 0 :
    top = line - diff
    bot = diff + 1
else :
    top = diff + 1
    bot = line - diff

print(f"{top}/{bot}")
