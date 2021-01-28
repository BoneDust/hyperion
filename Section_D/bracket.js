function BracketStack () {
    let openBracketsCount = 0  
    this.isEmpty = function () { //this function runs in constant time i.e O(1)
        return openBracketsCount === 0
    }
    this.push = function () { //this function runs in constant time
        openBracketsCount++
    }

    /**
    * @throws If stack is empty
    */
    this.pop = function () { //this function runs in constant time 
        if ( this.isEmpty()) throw new Error ( "Cannot pop empty stack" )
        openBracketsCount--
    }
}


/**
* @param {string} symbol
* @returns A function that checks if a given value is the symbol
*/
function isSymbol (symbol) { //this function runs in constant time i.e O(1)
    /**
    * @param {string} value
    * @returns {boolean}
    */
    function check (value) { //this function runs in constant time i.e O(1)
        return symbol === value
    }
    return check
}

/**
* Checks if a pair of brackets match
* @param {string} inputString
* @param {string} openingSymbol
* @param {string} closingSymbol
*/
function doBracketsMatch (inputString, openingSymbol, closingSymbol) {
    let stack = new BracketStack() //this line is O(1)
    let isOpeningSymbol = isSymbol(openingSymbol)//this line is O(1)
    let isClosingSymbol = isSymbol(closingSymbol)//this line is O(1)
    for ( let i = 0 ; i < inputString.length; i++) {//this loop is O(n), n being the length the length of the inputString
        let value = inputString[i] //this line is O(1)
        if (isOpeningSymbol(value)) stack.push() //the if-statement and stack.push are both O(1) so line is O(1) 
        if (isClosingSymbol(value)) //the if-statement is O(1)
            if (stack.isEmpty()) return false//the if-statement and return are both O(1) so line is O(1) 
            else stack.pop() //this line is O(1)
    }
    return stack.isEmpty()//O(1)
}

/*                  Time Complexity
* The function doBrackets has the possibility of being terminated before it iterates through the entire inputString if there's
* no opening bracket to match a closing bracket. However, there cases in which it will iterate the entire input. This is the worst-case
* in terms of time complexity and means executing the function will result in a complexity of O(n).
* This because all statements in it's body, except for the for-loop, are executed at constant time
* The 1st three lines(the lets), will result in an accumalative complexity of 3*O(1) which is just O(1)
* Inside the loop we have statements worth 5*O(1). this is execute n-times, so the loop has complexity of O(5n) which is just O(n)
* the last return-statement is O(1). 
* So in total we have O(1) + O(n) + O(1). O(n) is the dorminant term so the time complexity of the function is O(n). 
*/

/*                  Space Complexity
* The function doesn't provision any additional usage of memory nor is the initial size of the inputString reduced. 
* So the space complexity of the function is O(n). with n being the length of parameter inputString
*/