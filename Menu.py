#
from CPU import CPU_Comparison
from GPU import GPU_Comparison
#
cnt1 = 0
welcome = "--------------------------------------------Welcome to Frederik The Duck's CPU/GPU price to performance comparator.--------------------------------------------"
#
for c in welcome:
    cnt1 += 1
hf1 = "-" * cnt1
#
cnt2 = 0
bye = "-----------------------------------Goodbye and thanks for using Frederik The Duck's CPU/GPU price to performance comparator.-----------------------------------"
#
for c in welcome:
    cnt2 += 1
hf2 = "-" * cnt2
#
print("{}\n{}\n{}\n".format(hf1, welcome, hf1))
#
while True:
    option = input("Choose one of the following options:\n1. CPU\n2. GPU\n3. Exit\n--->")
    #
    if option == "1":
        CPU_Comparison
        print(1)
    elif option == "2":
        GPU_Comparison
        print(2)
    elif option == "3":
        print("{}\n{}\n{}\n".format(hf2, bye, hf2))
        break
    else:
        print("Syntax Error\nPlease try again.\n")

