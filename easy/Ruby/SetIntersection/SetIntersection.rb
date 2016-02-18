File.open(ARGV[0]).each_line do |line|
    tmp = line.rstrip.split(';')
    l1 = tmp[0].split(',')
    l2 = tmp[1].split(',')
    str = ""
    n = (l1.length * l2.length)
    n1 = l1.first
    n2 = l2.first
    for i in 1..n
        if n1 == n2
            str << "#{n1},"
            l1.shift
            l2.shift
            n1 = l1.first
            n2 = l2.first
        elsif Integer(n1) > Integer(n2)
            l2.shift
            n2 = l2.first
        elsif Integer(n1) < Integer(n2)
            l1.shift
            n1 = l1.first
        end

        if (n1.nil? || n2.nil?)
            break
        elsif (Integer(l1.last) < Integer(l2.first))
            break
        end
    end
    puts str.chop
end