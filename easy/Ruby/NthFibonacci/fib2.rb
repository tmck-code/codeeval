def fib2(n)
  raise "fib2 not defined for negative numbers" if n < 0
  new, old = 1, 0
  n.times {new, old = new + old, new}
  old
end

arr = [0, 5, 10, 124]
arr.each { |n|
  puts fib2 n
}