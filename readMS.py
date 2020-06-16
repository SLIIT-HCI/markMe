#this contains the readMS class

import re
class readMS:    

    def __init__(self,question):
        self.q = question

    # split the classes in the Marking scheme in order to identify the marking distribution accross sections
    def classSplit(self):
        file = open(self.q)
        r = file.read()

        return r.strip().split("#")

    #split the file into lines
    def lineSplit(self,cls):    

        return cls.split('\n')

    #remove special charactors
    def removeAlpha(self,line):
        return re.findall(r"[-+]?\d*\.\d+|\d+", line)

    #return mark allocations in each section
    def getMsMarks(self,classes):
        
        marks = []
        lines = []
        for i in range(0, len(classes)):
            lines.append(self.lineSplit(classes[i]))
        for i in range(0, len(lines)):
            for k in range(0,len(lines[i])):
                #print(lines[i][k])
                m = lines[i][k].split('//')
                if(len(m)>1):
                    marks.append(self.removeAlpha(m[1]))

        return marks
        
        
#q1 = readMS('questions/1a/Ques01.java')

#cl1 = q1.classSplit()


#print (q1.getMsMarks(cl1))
