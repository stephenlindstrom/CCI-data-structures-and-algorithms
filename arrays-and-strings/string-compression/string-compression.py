def main():
    print(compress("abffddddcccdd"))

def compress(text):
    prev = ""
    compressed_list = []
    count = 0
    for char in text:
        if char == prev:
            count += 1
        else:
            if count > 0:
                compressed_list.append(prev)
                compressed_list.append(str(count))
            prev = char
            count = 1
    compressed_list.append(prev)
    compressed_list.append(str(count))
    compressed_text = "".join(compressed_list)

    if len(compressed_text) >= len(text):
        return text
    else:
        return compressed_text

if __name__ == "__main__":
    main()