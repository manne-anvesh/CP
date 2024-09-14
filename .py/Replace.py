# The program will receive 3 English words inputs from STDIN
# 1. These three words will be read one at a time, in three separate lines
# 2. The first word should be changed like all vowels should be replaced by *
# 3. The second word should be changed like all consonants should be replaced by @
# 4. The third word should be changed like all char should be converted to upper case
# 5. Then concatenate the three words and print them
# Other than this concatenated word, no other characters/string should or message should be written to STDOUT
# For example if you print how are you then output should be h*wa@eYOU.
# You can assume that input of each word will not exceed more than 5 chars



st1 = input()
st2 = input()
st3 = input().upper()

v = "aeiouAEIOU"

st1 = list(st1)
for i in range(len(st1)):
    if(st1[i] in v):
        st1[i] = '*'
st1 = "".join(st1)


st2 = list(st2)
for i in range(len(st2)):
    if(st2[i] not in v):
        st2[i] = '@'
st2 = "".join(st2)


print(st1+st2+st3)

