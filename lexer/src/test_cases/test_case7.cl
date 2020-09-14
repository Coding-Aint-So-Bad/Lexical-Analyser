"We have \
unescaped characters \\\\\\
within this message \\\
"

-- we have multiple slashes but they all contain escaped newline characters

"We have \
unescaped characters \\\\\\
within this message
"

-- we have unescaped newline character in line 9 here and lexing is gonna continue from line 10