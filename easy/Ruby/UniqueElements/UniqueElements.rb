File.open(ARGV[0]).each_line do |str|
    arr = str.rstrip.split(',')
    curr = arr[0]
    line = "#{arr[0].to_s},"
    arr.each do |n|
        unless n == curr
            line << "#{n},"
            curr = n 
        end
    end
    puts line.chop
end