# There are reasons why this code will not get executed
# 1. Pay attention to how multiple variable are being declared and or assigned in one line otherwise you'll get a ValueError
#   e.g
#   var_a, var_b = 10, 15
#
# 2. An indentation block is expected after every function definition. Make sure there's logic code for those functions.
#    If the intention was to have empty fumctions, then make sure you pass them. google how to define empty functions.

# 3. Note that True and False are keywords in python so they cant be assigned to variables, However, you can pass them as parameters to the built-in bool() function
#     to emulate booleans.
#     e.g
#     isHungry = bool(False)
#
# 4. Pay attention to usage of undefined values in your code, especially during assignments as is the case with your code.
# 
# 5. Note that the raw_input method is not availble starting with python 3


# Important things to note
#1. You're making use of the SMSMessage classe but haven't yet created it. Look at how to create classes in python and how to initialise them
#2. This answers the question you asked. Make sure that the class methods that you want to use outside of the class are first publicly defined within the class block itself.
#   Your methods are already public. if you need some to be private, google how to define private methods in python


# An SMS Simulation class SMSMessage(object):
hasBeenRead = False messageText = text fromNumber = number
def __init__ (self,hasBeenRead,messageText,fromNumber):
    self.hasBeenRead = False self.messageText = text self.fromNumber = number

def MarkASRead (self):
    if userChoice == read:
        self.hasBeenRead = True

def add_sms ():
def get_count ():
def get_message ():
def get_unread_messages ():
def remove ():

no_1 = SMSMessage( False , "Hello" , "0798653452" )
no_2 = SMSMessage( False , "WYD" , "0845673864" )
no_3 = SMSMessage( False , "How are you?" , "0631873298" )

SMSStore = [] userChoice = ""
while userChoice != "quit" :
    userChoice = raw_input( "What would you like to do - read/send/quit?" )
    if userChoice == "read" :
        # Place your logic here elif userChoice == "send": # Place your logic here elif userChoice== "quit":
        print( "Goodbye" )
    else :
        print( "Oops - incorrect input" )