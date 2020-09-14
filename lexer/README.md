# COOL Compiler #

The code we used CoolLexer.g4 has lexiacl rules that must be followed by the strings and comments we supply to it.
This specific lexiacl analyzer was made with the help of antlr 4.5 in c++.

#Overview#
First of all we have a list of tokens which are basically the keywords that are recognized by us.
Next we have @members which contains all the member variables and our methods.
It contains the method reportError, which as the name suggests reports errors that are encountered by our lexer.
Later we have the method processString which is basically the backbone of our code.
It basically contains a few cases in which errors may occur, like strings with a size of over 1024 or strings containing null characters.
It also has rules which appends certain parts of the string to match out whitespace rules.

After this we have the LEXER rules down below.
This contains the ERROR.
The ERROR tells us about what to do when encountered by strings with null characters, unterminated strings, and EOF present within strings.

Next we have the keywords and symbols and their representations.
Most keywords can be a mix of lower and upper case letters.
Later we have all the characters that can be considered as white spaces.
After this we have the comment rules, which help us find the errors within comments.
We have 2 modes which take care of this.

#Test_Cases#
We have 7 test cases.
In these test cases we check the unterminated string constants.
We also check for strings that are too long.
We search for EOF in comments and unmatched *).
We make sure keywords and symbols are not recognised within strings.
We also make sure our lexer doesn't report errors for cases which don't have any.
We start with the helloworld.cl to check for correctness.
We use 4 other codes to check the correctness of our lexer.
We check it against odd/even code, lcd/gcd code, calculator.

After making sure our lexer reports all the errors it's supposed to and all the correctness it should accept we can say that our lexer is practically applicable.

