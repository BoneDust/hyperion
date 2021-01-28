def get_swap_indicators(num)
    #this array will contain booleans that corelate to the bits of binary number
    #eg 1001 will result in [true, false, false, true]
    result = Array.new

    while (num != 0)
        result.unshift(num % 2 == 1)
        num /= 2
    end
    return result
end

def swap(str, num)
    swap_indicators = get_swap_indicators(num)
    skipped_characters = 0
    
    for i in 0 .. str.length - 1
        if str[i].match?(/[A-Za-z]/)
            index = (i % swap_indicators.length()) - skipped_characters
            if(swap_indicators[index])
                str[i] = str[i].swapcase()
            end
        else
            skipped_characters+=1
        end
    end
    return str
end