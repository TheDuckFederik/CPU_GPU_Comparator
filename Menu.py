#
from CPU import CPU_Comparison
from GPU import GPU_Comparison
#
cnt = 0
welcome = "-----------------------------------------Hello and welcome to FrederikTheDuck's CPU/GPU Comparator.-----------------------------------------"
for i in welcome:
    cnt += 1
print("-----------------------------------------Hello and welcome to FrederikTheDuck's CPU/GPU Comparator.-----------------------------------------\n")
#
while True:
    option = input("Please choose between the following options:\n1. CPU Comparison\n2. GPU Comparison\n3. Exit\n--->")
    #
    if option == 1 or "1":
        CPU_Comparison
    elif option == 2 or "2":
        GPU_Comparison
    elif option == 3 or "3":
        print("bye")
        break
    else:
        print("Systax Error\nTry Again")
#
