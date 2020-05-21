## Reverse the letters in a word.

word = input("Enter a word: ")
reverseWord = ""
for ch in word:
    reverseWord = ch + reverseWord
print("The reversed word is " + reverseWord + ".")