def main():
    value = is_unique("helt!")
    print(value)

def is_unique(string_value):
    hash_table = [0] * 128
    if len(string_value) > 128:
        return "Not unique"
    for character in string_value:
        index = hash_function(character)
        if hash_table[index] != 1:
            hash_table[index] = 1
        else:
            return "Not unique"
    return "Unique"

def hash_function(character):
    return ord(character)

if __name__ == "__main__":
    main()

