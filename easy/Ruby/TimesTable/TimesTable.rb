require 'benchmark'

def mult1()
  arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
  shift_arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
  for x in 0..11
    line = ""
    for y in 0..11
      curr = shift_arr.shift
      line << '%4s' % (arr[x] * curr)
      shift_arr << curr
    end
    puts line.lstrip
  end
end

def mult2()
  for x in 1..12
    line = ""
    for y in 1..12
      line << '%4s' % (x * y)
    end
    puts line.lstrip
  end
end

Benchmark.bm do |x|
  puts "----------------------------------------------------------------------"
  puts "TESTING VERSION 1"
  x.report { mult1() }
  puts "----------------------------------------------------------------------"
  puts "TESTING VERSION 2"
  x.report { mult2() }

end