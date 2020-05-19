class getKeywords:
    
    def __init__(self):
        self.keywords = []

    def getKeys(self):
        keyFile = open('assets/keywords.txt')
        keyFileRead = keyFile.read()
        self.keywords = keyFileRead.strip().split('\n')
        for i in range(0,len(self.keywords)):
            self.keywords[i] = self.keywords[i].strip()

        return self.keywords


        



