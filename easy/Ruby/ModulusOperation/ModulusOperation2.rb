File.open(ARGV[0]).each_line do |line|
    arr = line.split(',')
    n = Integer(arr[0])
    m = Integer(arr[1])
    tmp = n / m
    if tmp == 0
        puts n
    else
        puts n - (m * tmp)
    end
end