# importing string library function 
import string 

# Function checks if input string 
# has only ascii letters or not 
def check(value): 
	for letter in value: 
		
		# If anything other than ascii 
		# letter is present, then return 
		# False, else return True 
		if letter not in string.ascii_letters: 
			return False
	return True

# Driver Code 
input1 = "GeeksForGeeks3"
print(input1, "--> ", check(input1)) 

input2 = "GeeksforGeeks"
print(input2, "--> ", check(input2)) 

input3 = "Geeks_for_geeks"
print(input3, "--> ", check(input3)) 
