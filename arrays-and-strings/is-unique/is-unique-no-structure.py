def main():
    value = is_unique("helo")
    print(value)

def is_unique(string_value):
    for i in range(len(string_value)):
        for j in range(i+1, len(string_value)):
            if string_value[i] == string_value[j]:
                return "Not unique"
    return "Unique"


if __name__ == "__main__":
    main()