File.open(ARGV[0]).each_line do |line|
    arr = line.split(',')
    n = Integer(arr[0])
    m = Integer(arr[1])
    curr = 0
    limit = n - m
    while curr < limit
        curr += m
    end
    puts (n - curr)
end