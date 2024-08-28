def main():
    URLify("hello world")

def URLify(text):
    new_string = ""
    for character in text:
        if character == " ":
            new_string = new_string + "%20"
        else:
            new_string = new_string + character
    print(new_string)
if __name__ == "__main__":
    main()