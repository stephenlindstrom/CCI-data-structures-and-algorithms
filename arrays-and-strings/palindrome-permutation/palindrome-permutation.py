def main():
    if is_palindrome_permutation("abc&() aabc"):
        print("Yes, text is palindrome")
    else:
        print("No, text is not palindrome")

def is_palindrome_permutation(text):
    hash_array = [0]*26
    letter_count = 0
    
    for character in text:
        index = ord(character)
        if index > 96 and index < 123:
            index = index - 97
            hash_array[index] += 1
            letter_count += 1
        elif index > 64 and index < 91:
            index = index - 65
            hash_array[index] += 1
            letter_count += 1

    if letter_count % 2 == 0:
        for freq in hash_array:
            if freq != 0 and freq % 2 != 0:
                return False
        return True
    
    else:
        odd_freq_flag = False
        for freq in hash_array:
            if freq != 0 and freq % 2 != 0:
                if odd_freq_flag:
                    return False
                else:
                    odd_freq_flag = True
        return True

if __name__ == "__main__":
    main()