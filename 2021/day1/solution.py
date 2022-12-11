with open("input.txt") as fp:
    lines = fp.readlines()
    number_larger = 0
    for i in range(len(lines) - 2):
        if int(lines[i]) < int(lines[i + 2]):
            number_larger += 1

    print(number_larger)
