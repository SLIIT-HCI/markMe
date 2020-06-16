# markMe

This is an attempt to automate the marking of the subject "Object Oriented Programing".

## Attempted steps
1. Extract sections and the allocated marks from a given marking scheme
2. Identify the keywords in the answer scripts and generate a source tree
3. Identify the extracted lines from the marking scheme in the answer script
4. Calculate the marks

### Prerequisites
* Python 2.7 - [https://www.python.org/downloads/release/python-2718/](https://www.python.org/downloads/release/python-2718/)

### Important Notes
* Clone this repository to a suitable location e.g.`~/markMe`
* `markMe.py` is the main script
* in `markMeNew.py`, Marking scheme tests are manually setuped
* in `/assets/` folder, `keywords.txt` contains all the keywords in Java language alphabetically
* in `/questions/` folder, marking scehmes can be found
* in`/IT18151152` folder, sample answers can be found
* `getKeywords.py` extract  the keywords from the `keywords.txt` and return the keywords array
* `readMs.py` will read an return the marking scheme properties
