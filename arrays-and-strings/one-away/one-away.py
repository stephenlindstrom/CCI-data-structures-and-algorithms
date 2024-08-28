def main():
    if one_away("bake", "bale"):
        print("One away")
    else:
        print("Not one away")

def one_away(text1, text2):
    length_difference = len(text1) - len(text2)

    if length_difference == 0:
        return check_replacement(text1, text2)
    
    elif length_difference == -1:
        return check_addition_removal(text1, text2)
    
    elif length_difference == 1:
        return check_addition_removal(text2, text1)
    
    else:
        return False
    
def check_replacement(text1, text2):
    num_changes = 0
    for i in range(len(text1)):
        if text1[i] != text2[i]:
            num_changes += 1
        if num_changes > 1:
            return False
    return True

def check_addition_removal(text1, text2):
    num_changes = 0
    i = k = 0
    while i < len(text1) and k < len(text2):
        if text1[i] != text2[k]:
            num_changes += 1
            k += 1
        else:
            i += 1
            k += 1
        if num_changes > 1:
            return False
    return True
    
if __name__ == "__main__":
    main()