File.open(ARGV[0]).each_line do |line|
    tmp = line.split(',')
    str = tmp[0]
    ch = tmp[1].rstrip
    limit = (str.length)
    found = false
    for i in 1..limit
        if str[-i] == ch
            puts limit - i
            found = true
            break 
        end
    end
    if !(found)
        puts "-1"
    end
end