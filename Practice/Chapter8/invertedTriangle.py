# Python3 code to demonstrate star pattern

# function to print spaces
def print_asterisk(space):
	
	# base case
	if (space == 0):
		return;
	print("* ", end = "");

	# recursively calling print_asterisk()
	print_asterisk(space - 1);

# function to print the pattern
def pattern(n, num):
	
	# base case
	if (n == 0):
		return;
	print_asterisk(n);
	print("");

	# recursively calling pattern()
	pattern(n-1, num);

# Driver Code
n = int(input("Enter the number : "));
pattern(n, n);