print("Hello This is Now the Code in Python")
print("Enter the String for the Longest Word")
a=str(input())
a = a.split(" ")
b = len(a)
current_sum = 0
final_sum = 0
index = 0
for i in range(b):
    current_sum = 0
    for j in range(len(a[i])):
        b = a[i]
        #print(b)
        d = b[j]
        #print(d)
        if d >= 'A' and d <= 'Z' or d >= 'a' and d <= 'z':
            current_sum = current_sum + 1
    if current_sum > final_sum:
        final_sum = current_sum
        index = i
    j = 0
    #print(final_sum)
print(a[index])
