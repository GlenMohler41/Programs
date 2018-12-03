import numpy, scipy.special, matplotlib.pyplot, os


class neurons:
    def __init__(self, nodesIn, nodesHidden, nodesOut, rateLearn):
        self.inn = nodesIn
        self.outn = nodesOut
        self.hidden = nodesHidden
        self.rate = rateLearn
        self.wih = numpy.random.rand(self.hidden, self.inn)-.5
        self.who = numpy.random.rand(self.outn, self.hidden)-.5
        self.activate = lambda x: scipy.special.expit(x)
        pass


    def query(self, inputaslist):
        input = numpy.array(inputaslist, ndmin=2).T
        hiddenInput = numpy.dot(self.wih, input)
        hiddenOutput = self.activate(hiddenInput)
        output = numpy.dot(self.who, hiddenOutput)
        output = self.activate(output)
        return output


    def train(self, inputaslist, targetaslist):
        target = numpy.array(targetaslist, ndmin=2).T
        input = numpy.array(inputaslist, ndmin=2).T

        hiddenInput = numpy.dot(self.wih, input)
        hiddenOutput = self.activate(hiddenInput)
        output = numpy.dot(self.who, hiddenOutput)
        output = self.activate(output)

        oerror = target-output
        herror = numpy.dot(self.who.T, oerror)

        self.who += self.rate * numpy.dot((oerror*output*(1.0-output)), numpy.transpose(hiddenOutput))
        self.wih += self.rate * numpy.dot((herror*hiddenOutput*(1.0-hiddenOutput)), numpy.transpose(input))
        pass



def loaddata(filepath):
    filepath = str(filepath)
    datafile = open(filepath,'r')
    datalist = datafile.readlines()
    datafile.close()
    return datalist

def plotadigit(digit,filename):
    data=loaddata(filename)
    allvals=data[digit].split(',')
    digit=allvals[0]
    imagearr=numpy.asfarray(allvals[1:]).reshape((28,28))
    matplotlib.pyplot.imshow(imagearr, cmap='Greys',interpolation='None')
    matplotlib.pyplot.show()
    return digit



def main():
    n=neurons(784,200,10,.2)
    data=loaddata('mnist_train.csv')
    print('training')
    x=0
    for i in data:
        allvals=i.split(',')
        digit=allvals[0]
        imagearr=numpy.asfarray(allvals[1:])
        input=(imagearr/255.0*.98)+.01
        target=numpy.zeros(10)+.01
        target[int(digit)]=.99
        n.train(input,target)
        x+=1
        print(x)

    testdata=loaddata('mnist_test.csv')
    scorecard=[]
    print('testing')
    x=0
    for i in testdata:
        allvals=i.split(',')
        digit=int(allvals[0])
        imagearr=numpy.asfarray(allvals[1:])
        input=(imagearr/255.0*.98)+.01
        output=n.query(input)
        answer=numpy.argmax(output)
        x+=1
        print(x)
        if (answer==digit):
            scorecard.append(1)
        else:
            scorecard.append(0)
            pass
    print(sum(scorecard)/len(scorecard))
    os.system('paplay /home/eloi/Downloads/done.wav')
    #print(scorecard)



main()
#print('Please type digit')
#digit=int(input())
#plotadigit(digit,'mnist_train_100.csv')
